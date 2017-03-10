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
    private HashMap<Integer, Integer> map = new HashMap<>();
    private int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) this.map.put(inorder[i], i);
        postIndex = postorder.length - 1;
        return builder(postorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode builder(int[] postorder, int[] inorder, int start, int end) {
        if (start > end) return null;
        int inOrderIndex = map.get(postorder[postIndex--]);
        TreeNode result = new TreeNode(inorder[inOrderIndex]);
        result.right = builder(postorder, inorder, inOrderIndex + 1, end);
        result.left = builder(postorder, inorder, start, inOrderIndex - 1);
        return result;
    }
}
