class Solution {
    private int[][] cache = new int[][]{
            new int[]{0, 1},
            new int[]{1, 0},
    };

    public int kthGrammar(int N, int K) {
        return N == 1 ? 0 : cache[kthGrammar(N - 1, K % 2 == 0 ? K / 2 : (K + 1) / 2) % 2][(K + 1) % 2];
    }
}
