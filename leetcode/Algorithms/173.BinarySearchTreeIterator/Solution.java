import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        travel(root, stack);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmp = stack.pop();
        travel(tmp.right, stack);
        return tmp.val;
    }

    private void travel(TreeNode root, Stack<TreeNode> stack) {
        while (root != null) {
            stack.add(root);
            root = root.left;
        }
    }
}
