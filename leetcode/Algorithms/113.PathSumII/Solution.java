import java.util.ArrayList;
import java.util.List;
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
    private List<List<Integer>> result = new ArrayList<>();
    private Stack<Integer> stack = new Stack<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return result;
        stack.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) result.add(new ArrayList<>(stack));
        pathSum(root.left, sum - root.val);
        pathSum(root.right, sum - root.val);
        stack.pop();
        return result;
    }
}
