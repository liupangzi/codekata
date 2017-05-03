public class Trie {

    class Node {
        Node[] index = new Node[26];
        boolean ends = false;

        public Node() {
        }
    }

    private Node root = new Node();

    public Trie() {
    }

    public void insert(String word) {
        if (word.length() == 0) {
            root.ends = true;
            return;
        }

        Node cursor = root;
        for (int i = 0; i < word.length(); i++) {
            if (cursor.index[word.charAt(i) - 'a'] == null) {
                Node tmp = new Node();
                cursor.index[word.charAt(i) - 'a'] = tmp;
                cursor = tmp;
            } else {
                cursor = cursor.index[word.charAt(i) - 'a'];
            }
            if (i == word.length() - 1) cursor.ends = true;
        }
    }

    public boolean search(String word) {
        Node cursor = getTarget(word);
        return cursor != null && cursor.ends;
    }

    public boolean startsWith(String prefix) {
        Node cursor = getTarget(prefix);
        return cursor != null;
    }

    private Node getTarget(String s) {
        Node cursor = root;
        for (int i = 0; i < s.length(); i++) {
            Node tmp = cursor.index[s.charAt(i) - 'a'];
            if (tmp == null) return null;
            cursor = tmp;
        }
        return cursor;
    }
}
