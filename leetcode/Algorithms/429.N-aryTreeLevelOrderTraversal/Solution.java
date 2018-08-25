class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Node> buffer = new ArrayList<>();
        if (root != null) buffer.add(root);

        while (buffer.size() != 0) {
            ArrayList<Node> next = new ArrayList<>();
            ArrayList<Integer> tmp = new ArrayList<>();
            for (Node n : buffer) {
                tmp.add(n.val);
                next.addAll(n.children);
            }
            result.add(tmp);
            buffer = next;
        }
        return result;
    }
}
