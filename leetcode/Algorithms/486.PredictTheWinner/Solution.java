public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length, dp[][] = new int[len][len];
        for (int i = 0; i < len; i++) dp[i][i] = nums[i];
        for (int delta = 1; delta < len; delta++) {
            for (int i = 0; i + delta < len; i++) {
                dp[i][delta + i] = Math.max(nums[i] - dp[i + 1][delta + i], nums[delta + i] - dp[i][delta + i - 1]);
            }
        }
        return dp[0][len - 1] >= 0;
    }
}
