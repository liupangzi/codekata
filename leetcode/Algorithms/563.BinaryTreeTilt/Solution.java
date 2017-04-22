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
    private int result = 0;

    public int findTilt(TreeNode root) {
        helper(root);
        return result;
    }

    private int helper(TreeNode treeNode) {
        if (treeNode == null) return 0;
        int left = helper(treeNode.left), right = helper(treeNode.right);
        result += Math.abs(left - right);
        return treeNode.val + left + right;
    }
}
