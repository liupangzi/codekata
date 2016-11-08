public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length, result[] = new int[len];
        Arrays.fill(result, 1);

        int p = 1, q = 1;
        for (int i = 0; i < len; i++) {
            result[i] *= p;
            p *= nums[i];
            result[len - 1 - i] *= q;
            q *= nums[len - 1 - i];
        }

        return result;
    }
}
