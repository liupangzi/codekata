class Solution {
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        boolean[][] table = new boolean[N][N];
        for (int[] line : mines) table[line[0]][line[1]] = true;
        int[][] up = new int[N][N], down = new int[N][N], left = new int[N][N], right = new int[N][N];

        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--) {
                if (!table[i][j]) {
                    down[i][j] = i == N - 1 ? 1 : down[i + 1][j] + 1;
                    right[i][j] = j == N - 1 ? 1 : right[i][j + 1] + 1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!table[i][j]) {
                    up[i][j] = i > 0 ? up[i - 1][j] + 1 : 1;
                    left[i][j] = j > 0 ? left[i][j - 1] + 1 : 1;
                    int tmp = Math.min(Math.min(left[i][j], right[i][j]), Math.min(up[i][j], down[i][j]));
                    max = Math.max(max, tmp);
                }
            }
        }
        return max;
    }
}
