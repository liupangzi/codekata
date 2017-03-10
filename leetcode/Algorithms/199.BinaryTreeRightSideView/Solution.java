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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode tmp = new TreeNode(0);

        if (root != null) queue.add(root);
        while (queue.size() != 0) {
            int count = queue.size();
            while (count-- > 0) {
                tmp = queue.poll();
                if (tmp.left != null) queue.add(tmp.left);
                if (tmp.right != null) queue.add(tmp.right);
            }
            result.add(tmp.val);
        }
        return result;
    }
}
