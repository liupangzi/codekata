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
    private int origin;

    public int pathSum(TreeNode root, int sum) {
        this.origin = sum;
        helper(root, new int[]{sum});
        return this.result;
    }

    private void helper(TreeNode root, int[] tmp) {
        if (root == null) return;

        int[] cur = new int[tmp.length + 1];
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == root.val) this.result++;
            cur[i] = tmp[i] - root.val;
        }
        cur[tmp.length] = this.origin;

        helper(root.right, cur);
        helper(root.left, cur);
    }
}
