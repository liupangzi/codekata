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
    private long n = (long) Integer.MIN_VALUE - 1;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left) || root.val <= n) return false;
        n = root.val;
        return isValidBST(root.right);
    }
}
