public class Solution {
    class UnionFind {
        private int[] id, sz;

        UnionFind(int height, int length) {
            id = new int[height * length];
            sz = new int[height * length];
            for (int i = 0; i < height * length; i++) sz[i] = 1;
            for (int j = 1; j < height - 1; j++) {
                for (int k = 1; k < length - 1; k++) id[j * length + k] = j * length + k;
            }
        }

        boolean connected(int p, int q) {
            return find(p) == find(q);
        }

        int find(int p) {
            while (p != id[p]) {
                id[p] = id[id[p]];
                p = id[p];
            }
            return p;
        }

        void union(int p, int q) {
            int pRoot = find(p);
            int qRoot = find(q);
            if (pRoot == qRoot) return;

            if (sz[pRoot] > sz[qRoot]) {
                id[qRoot] = pRoot;
                sz[pRoot] += sz[qRoot];
            } else {
                id[pRoot] = qRoot;
                sz[qRoot] += sz[pRoot];
            }
        }
    }

    public void solve(char[][] board) {
        if (board.length == 0) return;

        int height = board.length, length = board[0].length;
        UnionFind unionFind = new UnionFind(height, length);

        for (int i = 0; i < height - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                int tmp = i * length + j;
                if (board[i][j] == 'O') {
                    if (i + 1 < height && board[i + 1][j] == 'O') unionFind.union(tmp, tmp + length);
                    if (j + 1 < length && board[i][j + 1] == 'O') unionFind.union(tmp, tmp + 1);
                } else {
                    unionFind.id[tmp] = 0;
                }
            }
        }

        for (int m = 1; m < height - 1; m++) {
            for (int n = 1; n < length - 1; n++) {
                if (!unionFind.connected(0, m * length + n)) board[m][n] = 'X';
            }
        }
    }
}
