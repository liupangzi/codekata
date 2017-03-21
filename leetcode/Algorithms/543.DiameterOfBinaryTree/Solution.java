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

    public int diameterOfBinaryTree(TreeNode root) {
        travel(root);
        return result;
    }

    private int travel(TreeNode treeNode) {
        if (treeNode == null) return -1;
        int left = travel(treeNode.left) + 1, right = travel(treeNode.right) + 1;
        result = Math.max(result, left + right);
        return Math.max(right, left);
    }
}
