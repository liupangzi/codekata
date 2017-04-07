public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int start = 0, end = 0, sum = 0, result = nums.length + 1;
        while (end < nums.length) {
            sum += nums[end];
            end++;
            while (sum >= s) {
                result = Math.min(result, end - start);
                sum -= nums[start];
                start++;
            }
        }
        return result == nums.length + 1 ? 0 : result;
    }
}
