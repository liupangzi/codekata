public class Solution {
    public int jump(int[] nums) {
        int result = 0, currentMax = 0, max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == currentMax) {
                result++;
                currentMax = max;
            }
        }
        return result;
    }
}
