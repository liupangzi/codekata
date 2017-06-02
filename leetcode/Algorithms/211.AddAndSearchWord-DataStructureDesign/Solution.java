import java.util.LinkedList;
import java.util.Queue;

public class WordDictionary {

    class Node {
        Node[] index = new Node[26];
        boolean ends = false;

        public Node() {
        }
    }

    private Node root = new Node();

    public WordDictionary() {
    }

    public void addWord(String word) {
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
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 0; i < word.length(); i++) {
            int queueSize = queue.size();
            if (queueSize == 0) break;
            if (word.charAt(i) == '.') {
                for (int j = 0; j < queueSize; j++) {
                    Node tmp = queue.poll();
                    for (int k = 0; k < 26; k++) {
                        if (tmp.index[k] != null) {
                            if (i == word.length() - 1 && tmp.index[k].ends) return true;
                            queue.add(tmp.index[k]);
                        }
                    }
                }
            } else {
                for (int j = 0; j < queueSize; j++) {
                    Node tmp = queue.poll();
                    if (tmp.index[word.charAt(i) - 'a'] != null) {
                        if (i == word.length() - 1 && tmp.index[word.charAt(i) - 'a'].ends) return true;
                        queue.add(tmp.index[word.charAt(i) - 'a']);
                    }
                }
            }
        }
        return false;
    }
}
