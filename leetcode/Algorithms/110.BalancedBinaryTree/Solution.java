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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(treeDepth(root.right) - treeDepth(root.left)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    private int treeDepth(TreeNode root) {
        return root == null ? 0 : Math.max(treeDepth(root.left), treeDepth(root.right)) + 1;
    }
}
