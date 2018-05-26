class Solution {
    private int result = 0;

    public int minimumLengthEncoding(String[] words) {
        Node node = new Node(null);
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                constructNode(node, word, word.length() - 1);
            }
        }

        traverseNode(node, 1);
        return result;
    }

    private void constructNode(Node node, String word, int index) {
        if (index == -1) return;
        char c = word.charAt(index);
        if (node.leaves == null) node.leaves = new Node[26];
        if (node.leaves[c - 'a'] == null) node.leaves[c - 'a'] = new Node(null);
        constructNode(node.leaves[word.charAt(index) - 'a'], word, index - 1);
    }

    private void traverseNode(Node node, int tmp) {
        if (node.leaves == null) {
            result += tmp;
            return;
        }

        for (Node next : node.leaves) {
            if (next != null) traverseNode(next, tmp + 1);
        }
    }
}

class Node {
    Node[] leaves;

    Node(Node[] l) {
        leaves = l;
    }
}
