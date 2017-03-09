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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> tmp = new Stack<>(), stack = new Stack<>(), pStack = new Stack<>(), qStack = new Stack<>();

        while (root != null || stack.size() > 0) {
            if (root != null) {
                if (root.right != null) stack.add(root.right);
                tmp.add(root);
                if (root == p) pStack = (Stack<TreeNode>) tmp.clone();
                if (root == q) qStack = (Stack<TreeNode>) tmp.clone();
                root = root.left;
            } else {
                while (tmp.peek().right != stack.peek()) tmp.pop();
                root = stack.pop();
            }
        }

        while (pStack.size() > qStack.size()) pStack.pop();
        while (qStack.size() > pStack.size()) qStack.pop();
        while (pStack.peek() != qStack.peek()) {
            qStack.pop();
            pStack.pop();
        }

        return qStack.peek();
    }
}
