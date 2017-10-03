class Solution {
    private int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return max;
    }

    private int helper(TreeNode node) {
        if (node == null || (node.right == null && node.left == null)) return 0;
        int left = helper(node.left), right = helper(node.right), result = 0;

        if (node.left != null && node.val == node.left.val) {
            left++;
            max = Math.max(left, max);
            result = Math.max(result, left);
        }

        if (node.right != null && node.val == node.right.val) {
            right++;
            max = Math.max(right, max);
            result = Math.max(result, right);
        }

        if (node.left != null && node.right != null) {
            if (node.val == node.right.val && node.val == node.left.val) max = Math.max(max, left + right);
        }

        return result;
    }
}
