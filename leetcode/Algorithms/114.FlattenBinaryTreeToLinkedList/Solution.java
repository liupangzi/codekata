import java.util.Stack;

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
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cursor = root;
        while (cursor != null) {
            if (cursor.right != null) stack.push(cursor.right);
            if (cursor.left != null) {
                cursor.right = cursor.left;
            } else {
                if (!stack.isEmpty()) cursor.right = stack.pop();
            }
            cursor.left = null;
            cursor = cursor.right;
        }
    }
}
