class Solution {
    private int[][] tmp = new int[101][2];  // depth, parent

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        travel(root, 0);
        return tmp[x][0] == tmp[y][0] && tmp[x][1] != tmp[y][1];
    }

    private void travel(TreeNode root, int level) {
        tmp[root.val][0] = level;

        if (root.left != null) {
            tmp[root.left.val][1] = root.val;
            travel(root.left, level + 1);
        }

        if (root.right != null) {
            tmp[root.right.val][1] = root.val;
            travel(root.right, level + 1);
        }
    }
}