public class Solution {
    public int findMaximumXOR(int[] nums) {
        int result = 0;
        Trie root = new Trie();
        for (int num : nums) {
            updateTrie(root, num);
            result = Math.max(result, num ^ findMaxXOR(root, num));
        }
        return result;
    }

    private void updateTrie(Trie root, int value) {
        int cursor = 0b10000000000000000000000000000000;
        for (int i = 0; i < 32; i++) {
            if ((value & cursor) != 0) {
                if (root.right == null) root.right = new Trie();
                root = root.right;
            } else {
                if (root.left == null) root.left = new Trie();
                root = root.left;
            }
            cursor >>>= 1;
        }
        root.v = value;
    }

    private int findMaxXOR(Trie root, int value) {
        int cursor = 0b10000000000000000000000000000000;
        for (int i = 0; i < 32; i++) {
            if ((value & cursor) != 0) {
                root = root.left == null ? root.right : root.left;
            } else {
                root = root.right == null ? root.left : root.right;
            }
            cursor >>>= 1;
        }
        return root.v;
    }
}

class Trie {
    int v;
    Trie left, right;
}
