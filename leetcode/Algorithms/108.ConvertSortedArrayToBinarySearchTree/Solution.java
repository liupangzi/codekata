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
    public TreeNode sortedArrayToBST(int[] nums) {
        return parseTree(nums, 0, nums.length - 1);
    }

    private TreeNode parseTree(int[] nums, int start, int end) {
        if (end < start) return null;
        int mid = (start + end) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = parseTree(nums, start, mid - 1);
        treeNode.right = parseTree(nums, mid + 1, end);
        return treeNode;
    }
}
