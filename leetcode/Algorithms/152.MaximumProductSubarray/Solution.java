public class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0], a = 1, b = 1;

        for (int num : nums) {
            result = Math.max(result, a *= num);
            if (num == 0) a = 1;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result = Math.max(result, b *= nums[i]);
            if (nums[i] == 0) b = 1;
        }

        return result;
    }
}
