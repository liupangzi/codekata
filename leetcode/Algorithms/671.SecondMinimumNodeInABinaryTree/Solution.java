class Solution {
    private int result = -1;

    public int findSecondMinimumValue(TreeNode root) {
        travel(root, root.val);
        return result;
    }

    private void travel(TreeNode node, int v) {
        if (node == null) return;
        if (node.val == v) {
            travel(node.left, v);
            travel(node.right, v);
        } else {
            result = result == -1 ? node.val : Math.min(result, node.val);
        }
    }
}
