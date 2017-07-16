public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = 0, last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                max += nums[i];
                last = max;
            } else {
                last += nums[i] - nums[i - k];
                max = Math.max(max, last);
            }
        }
        return max / (double) k;
    }
}
