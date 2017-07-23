import java.util.List;

public class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Trie trie = new Trie();
        for (String s : dict) trie.insert(s);

        String[] array = sentence.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = trie.getRoot(array[i]);
        }
        return String.join(" ", array);
    }
}

class Trie {

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

    public String getRoot(String s) {
        Node cursor = root;
        for (int i = 0; i < s.length(); i++) {
            Node tmp = cursor.index[s.charAt(i) - 'a'];
            if (tmp == null) return s;
            if (tmp.ends) return s.substring(0, i + 1);
            cursor = tmp;
        }
        return s;
    }
}
