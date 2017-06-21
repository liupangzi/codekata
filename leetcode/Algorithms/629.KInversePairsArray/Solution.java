public class Solution {
    public int kInversePairs(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 1; i <= n; i++) dp[i][0] = 1;
        for (int p = 2; p <= n; p++) {
            for (int q = 1; q <= k; q++) {
                int start = Math.max(0, q + 1 - p);
                dp[p][q] = start == 0 ? dp[p - 1][q] : dp[p - 1][q] + 1000000007 - dp[p - 1][start - 1];
                dp[p][q] %= 1000000007;
                dp[p][q] += dp[p][q - 1];
                dp[p][q] %= 1000000007;
            }
        }
        return dp[n][k];
    }
}
