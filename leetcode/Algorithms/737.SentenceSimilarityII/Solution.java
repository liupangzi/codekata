import java.util.HashMap;

class Solution {
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) return false;

        UF uf = new UF(pairs.length * 2);
        int n = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] pair : pairs) {
            map.putIfAbsent(pair[0], n++);
            map.putIfAbsent(pair[1], n++);
            if (!uf.connected(map.get(pair[0]), map.get(pair[1]))) uf.union(map.get(pair[0]), map.get(pair[1]));
        }

        for (int i = 0; i < words1.length; i++) {
            if (words1[i].equals(words2[i])) continue;
            Integer a = map.get(words1[i]), b = map.get(words2[i]);
            if (a == null || b == null) return false;
            if (!uf.connected(a, b)) return false;
        }
        return true;
    }

    class UF {
        private int[] parent;
        private byte[] rank;

        UF(int n) {
            parent = new int[n];
            rank = new byte[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        boolean connected(int p, int q) {
            return find(p) == find(q);
        }

        void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;

            if (rank[rootP] < rank[rootQ]) {
                parent[rootP] = rootQ;
            } else if (rank[rootP] > rank[rootQ]) {
                parent[rootQ] = rootP;
            } else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
        }
    }
}
