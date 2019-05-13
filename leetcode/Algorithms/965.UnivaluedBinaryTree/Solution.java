class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;

        if (root.left != null && root.right != null) {
            return root.val == root.left.val && root.val == root.right.val && isUnivalTree(root.left) && isUnivalTree(root.right);
        } else if (root.left == null) {
            return root.val == root.right.val && isUnivalTree(root.right);
        } else {
            return root.val == root.left.val && isUnivalTree(root.left);
        }
    }
}s