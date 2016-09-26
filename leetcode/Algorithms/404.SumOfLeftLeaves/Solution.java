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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null && (root.left.left == null && root.left.right == null)) {
            return sumOfLeftLeaves(root.right) + root.left.val;
        }

        return  sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);
    }
}
