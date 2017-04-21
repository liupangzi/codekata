public class Solution {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        rob(root.left);
        rob(root.right);

        int l1 = root.val, l2 = 0;
        if (root.left != null) {
            l2 += root.left.val;
            if (root.left.left != null) l1 += root.left.left.val;
            if (root.left.right != null) l1 += root.left.right.val;
        }
        if (root.right != null) {
            l2 += root.right.val;
            if (root.right.left != null) l1 += root.right.left.val;
            if (root.right.right != null) l1 += root.right.right.val;
        }
        root.val = Math.max(l1, l2);
        return root.val;
    }
}
