import java.util.*;

public class Solution {
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

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String, Integer> map = new HashMap<>();
        UF uf = new UF(accounts.size());

        for (int i = 0; i < accounts.size(); i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                if (map.containsKey(accounts.get(i).get(j))) {
                    int origin = map.get(accounts.get(i).get(j));
                    if (origin != i && !uf.connected(origin, i)) uf.union(origin, i);
                } else {
                    map.put(accounts.get(i).get(j), i);
                }
            }
        }

        HashMap<Integer, HashSet<String>> cache = new HashMap<>();
        outer:
        for (int i = 0; i < accounts.size(); i++) {
            for (Map.Entry<Integer, HashSet<String>> entry : cache.entrySet()) {
                if (uf.connected(entry.getKey(), i)) {
                    entry.getValue().addAll(accounts.get(i).subList(1, accounts.get(i).size()));
                    continue outer;
                }
            }
            cache.put(i, new HashSet<>());
            cache.get(i).addAll(accounts.get(i).subList(1, accounts.get(i).size()));
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<Integer, HashSet<String>> entry : cache.entrySet()) {
            List<String> head = new ArrayList<>(), tail = new ArrayList<>(entry.getValue());
            head.add(accounts.get(entry.getKey()).get(0));
            Collections.sort(tail);
            head.addAll(tail);
            result.add(head);
        }
        return result;
    }
}
