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
    private int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) this.map.put(inorder[i], i);
        return builder(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode builder(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) return null;
        int inOrderIndex = map.get(preorder[preIndex++]);
        TreeNode result = new TreeNode(inorder[inOrderIndex]);
        result.left = builder(preorder, inorder, start, inOrderIndex - 1);
        result.right = builder(preorder, inorder, inOrderIndex + 1, end);
        return result;
    }
}
