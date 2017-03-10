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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode treeNode = new TreeNode(0);
        boolean rightToLeft = true;

        if (root != null) queue.add(root);
        while (queue.size() > 0) {
            int n = queue.size();
            List<Integer> list = new ArrayList<>();
            while (n-- > 0) {
                treeNode = queue.poll();
                if (treeNode.left != null) queue.add(treeNode.left);
                if (treeNode.right != null) queue.add(treeNode.right);
                if (rightToLeft) {
                    list.add(treeNode.val);
                } else {
                    list.add(0, treeNode.val);
                }
            }
            rightToLeft = !rightToLeft;
            result.add(list);
        }
        return result;
    }
}
