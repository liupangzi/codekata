import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int result = 0;
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> index = new LinkedList<>();
        queue.add(root);
        index.add(0);

        while (queue.size() != 0) {
            int size = queue.size(), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            while (size-- > 0) {
                TreeNode tmp = queue.poll();
                int k = index.poll();
                max = Math.max(max, k);
                min = Math.min(min, k);

                if (tmp.left != null) {
                    queue.add(tmp.left);
                    index.add(k * 2 + 1);
                }

                if (tmp.right != null) {
                    queue.add(tmp.right);
                    index.add(k * 2 + 2);
                }
            }
            result = Math.max(result, max - min + 1);
        }
        return result;
    }
}
