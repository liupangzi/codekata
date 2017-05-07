public class Solution {
    public int findPaths(int m, int n, int N, int i, int j) {
        if (N == 0) return 0;

        int[][][] dp = new int[N][m][n];
        for (int p = 0; p < m; p++) {
            for (int q = 0; q < n; q++) {
                if (p == 0) dp[0][p][q]++;
                if (p == m - 1) dp[0][p][q]++;
                if (q == 0) dp[0][p][q]++;
                if (q == n - 1) dp[0][p][q]++;
            }
        }

        for (int x = 1; x < N; x++) {
            for (int y = 0; y < m; y++) {
                for (int z = 0; z < n; z++) {
                    dp[x][y][z] += y == 0 ? 1 : dp[x - 1][y - 1][z];
                    dp[x][y][z] %= 1000000007;
                    dp[x][y][z] += y == m - 1 ? 1 : dp[x - 1][y + 1][z];
                    dp[x][y][z] %= 1000000007;
                    dp[x][y][z] += z == 0 ? 1 : dp[x - 1][y][z - 1];
                    dp[x][y][z] %= 1000000007;
                    dp[x][y][z] += z == n - 1 ? 1 : dp[x - 1][y][z + 1];
                    dp[x][y][z] %= 1000000007;
                }
            }
        }
        return dp[N - 1][i][j];
    }
}
