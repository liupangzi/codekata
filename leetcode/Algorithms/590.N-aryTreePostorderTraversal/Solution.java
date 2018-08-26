class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if (root != null) stack.add(root);
        while (!stack.empty()) {
            Node node = stack.pop();
            result.add(node.val);
            for (Node n : node.children) stack.push(n);
        }
        Collections.reverse(result);
        return result;
    }
}
