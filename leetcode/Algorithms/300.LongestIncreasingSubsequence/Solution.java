import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int result = 0;
        for (int num : nums) {
            int position = Arrays.binarySearch(dp, 0, result, num);
            if (position < 0) {
                position = -(position + 1);
                dp[position] = num;
            }
            if (position == result) result++;
        }
        return result;
    }
}
