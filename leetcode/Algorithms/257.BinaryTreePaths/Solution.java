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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result = new ArrayList<>();
        if (root != null) helper(result, String.valueOf(root.val), root);
        return result;
    }

    private void helper(ArrayList<String> result, String tmp, TreeNode root) {
        if (root.right == null && root.left == null) result.add(tmp);
        if (root.left != null) helper(result, tmp + "->" + String.valueOf(root.left.val), root.left);
        if (root.right != null) helper(result, tmp + "->" + String.valueOf(root.right.val), root.right);
    }
}
