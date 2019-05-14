class Solution {
    private int result = 0;

    public int sumRootToLeaf(TreeNode root) {
        travel(root, root.val);
        return result;
    }

    private void travel(TreeNode node, int n) {
        if (node.left == null && node.right == null) {
            result += n;
        } else {
            if (node.left != null) travel(node.left, (n << 1) + node.left.val);
            if (node.right != null) travel(node.right, (n << 1) + node.right.val);
        }
    }
}