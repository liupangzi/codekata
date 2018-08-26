class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if (root != null) stack.push(root);
        while (!stack.empty()) {
            Node tmp = stack.pop();
            for (int i = tmp.children.size() - 1; i >= 0; i--) {
                stack.push(tmp.children.get(i));
            }
            result.add(tmp.val);
        }
        return result;
    }
}
