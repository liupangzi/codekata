public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int result = 1, base = 1;
        TreeNode rightCursor = root, leftCursor = root;
        while (rightCursor.right != null) {
            base <<= 1;
            result += base;
            rightCursor = rightCursor.right;
            leftCursor = leftCursor.left;
        }
        if (leftCursor.left == null) return result;

        int start = 0, end = result >> 1, next = (end + 1) >> 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (getNode(root, next, mid).right != null) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return getNode(root, next, start).left != null ? result + start * 2 + 1 : result + start * 2;
    }

    private TreeNode getNode(TreeNode root, int next, int way) {
        TreeNode cursor = root;
        while (next != 0) {
            cursor = (next & way) > 0 ? cursor.right : cursor.left;
            next >>= 1;
        }
        return cursor;
    }
}
