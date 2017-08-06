import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int level = 0;

    public List<List<String>> printTree(TreeNode root) {
        updateLevel(root, 1);
        List<String> width = new ArrayList<>();
        for (int i = 0; i < (int) Math.pow(2.0, (double) level) - 1; i++) width.add("");
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < level; i++) result.add(new ArrayList<>(width));
        updateMatrix(result, 0, (width.size() - 1) / 2, (int) Math.pow(2.0, (double) (level - 2)), root);
        return result;
    }

    private void updateLevel(TreeNode node, int currentLevel) {
        if (node == null) return;
        level = Math.max(currentLevel, level);
        updateLevel(node.right, currentLevel + 1);
        updateLevel(node.left, currentLevel + 1);
    }

    private void updateMatrix(List<List<String>> result, int row, int index, int offset, TreeNode node) {
        if (row >= result.size() || node == null) return;
        result.get(row).set(index, String.valueOf(node.val));
        updateMatrix(result, row + 1, index + offset, offset / 2, node.right);
        updateMatrix(result, row + 1, index - offset, offset / 2, node.left);
    }
}
