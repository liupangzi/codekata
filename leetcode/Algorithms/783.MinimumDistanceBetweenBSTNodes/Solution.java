class Solution {
    private int result = Integer.MAX_VALUE;
    private int last = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        helper(root);
        return result;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        if (last != Integer.MAX_VALUE) result = Math.min(result, root.val - last);
        last = root.val;
        helper(root.right);
    }
}
