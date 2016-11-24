/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode node, int sum) {
        if (node == null) return 0;
        if (node.right == null && node.left == null) return sum * 10 + node.val;
        return helper(node.left, sum * 10 + node.val) + helper(node.right, sum * 10 + node.val);
    }
}
