import java.util.ArrayList;

public class Solution {
    private ArrayList<Integer> list;

    public int kthSmallest(TreeNode root, int k) {
        list = new ArrayList<>();
        travel(root, k);
        return list.get(list.size() - 1);
    }

    private void travel(TreeNode treeNode, int k) {
        if (list.size() != k) {
            if (treeNode.left != null) travel(treeNode.left, k);
            if (list.size() != k) list.add(treeNode.val);
            if (treeNode.right != null) travel(treeNode.right, k);
        }
    }
}
