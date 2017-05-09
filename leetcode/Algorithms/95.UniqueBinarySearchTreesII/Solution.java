import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private HashMap<String, List<TreeNode>> map = new HashMap<>();

    public List<TreeNode> generateTrees(int n) {
        return n == 0 ? new ArrayList<>() : helper(1, n);
    }

    private List<TreeNode> helper(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            result.add(null);
            return result;
        }

        for (int i = start; i <= end; i++) {
            String leftKey = start + "|" + String.valueOf(i - 1), rightKey = String.valueOf(i + 1) + "|" + end;
            if (!map.containsKey(leftKey)) map.put(leftKey, helper(start, i - 1));
            if (!map.containsKey(rightKey)) map.put(rightKey, helper(i + 1, end));
            for (TreeNode leftNode : map.get(leftKey)) {
                for (TreeNode rightNode : map.get(rightKey)) {
                    TreeNode tmp = new TreeNode(i);
                    tmp.left = leftNode;
                    tmp.right = rightNode;
                    result.add(tmp);
                }
            }
        }
        if (!map.containsKey(start + "|" + end)) map.put(start + "|" + end, result);
        return result;
    }
}
