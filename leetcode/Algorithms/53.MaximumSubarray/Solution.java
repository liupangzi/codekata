public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tmp = Math.max(nums[i] + tmp, nums[i]);
            max = Math.max(tmp, max);
        }
        return max;
    }
}
