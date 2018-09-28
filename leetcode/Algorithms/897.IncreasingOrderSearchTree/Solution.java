class Solution {
    private TreeNode cursor = new TreeNode(0);

    public TreeNode increasingBST(TreeNode root) {
        TreeNode result = cursor;
        helper(root);
        return result.right;
    }

    private void helper(TreeNode node) {
        if (node == null) return;
        TreeNode left = node.left, right = node.right;
        node.left = null;
        node.right = null;

        helper(left);
        cursor.right = node;
        cursor = cursor.right;
        helper(right);
    }
}
