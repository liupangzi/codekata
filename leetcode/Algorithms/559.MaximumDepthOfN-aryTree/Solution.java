class Solution {
    private int result = 0;

    public int maxDepth(Node root) {
        helper(root, 1);
        return result;
    }

    private void helper(Node n, int depth) {
        if (n == null) return;
        result = Math.max(result, depth);
        for (Node node : n.children) {
            helper(node, depth + 1);
        }
    }
}
