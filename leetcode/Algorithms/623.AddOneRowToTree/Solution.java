import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        TreeNode dummyTree = new TreeNode(0);
        dummyTree.left = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(dummyTree);
        for (int i = 1; i < d; i++) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode tmp = queue.poll();
                if (tmp.left != null) queue.add(tmp.left);
                if (tmp.right != null) queue.add(tmp.right);
            }
        }

        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            TreeNode newLeft = new TreeNode(v), newRight = new TreeNode(v);
            newLeft.left = tmp.left;
            newRight.right = tmp.right;
            tmp.left = newLeft;
            tmp.right = newRight;
        }
        return dummyTree.left;
    }
}
