class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        if (root1 != null) helper(root1, a);
        if (root2 != null) helper(root2, b);
        return a.equals(b);
    }

    private void helper(TreeNode node, ArrayList<Integer> list) {
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }
        if (node.left != null) helper(node.left, list);
        if (node.right != null) helper(node.right, list);
    }
}
