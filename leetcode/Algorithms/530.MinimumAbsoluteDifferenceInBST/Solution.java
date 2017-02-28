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
    private int delta = Integer.MAX_VALUE;
    private int prev = -1;

    public int getMinimumDifference(TreeNode root) {
        travel(root);
        return delta;
    }

    private void travel(TreeNode root) {
        if (root.left != null) travel(root.left);
        if (prev >= 0) delta = Math.min(root.val - prev, delta);
        prev = root.val;
        if (root.right != null) travel(root.right);
    }
}
