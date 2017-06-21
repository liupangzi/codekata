public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int delta = nums[1] - nums[0], result = delta == 0 ? 1 : 2;
        for (int i = 2; i < nums.length; i++) {
            int n = nums[i] - nums[i - 1];
            if ((delta >= 0 && n < 0) || (delta <= 0 && n > 0)) {
                delta = n;
                result++;
            }
        }
        return result;
    }
}
