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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            TreeNode a = stack.pop(), b = stack.pop();
            if (a == null && b == null) continue;
            if (a == null || b == null || a.val != b.val) return false;
            stack.push(a.left);
            stack.push(b.right);
            stack.push(b.left);
            stack.push(a.right);
        }

        return true;
    }
}
