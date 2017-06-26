import java.util.Arrays;

public class Solution {
    public int maximumProduct(int[] nums) {
        int[] cache = nums.length <= 5 ? nums : Arrays.copyOfRange(nums, 0, 5);
        Arrays.sort(cache);
        for (int i = 5; i < nums.length; i++) {
            if (nums[i] < cache[0]) {
                cache[1] = cache[0];
                cache[0] = nums[i];
            } else if (nums[i] < cache[1]) {
                cache[1] = nums[i];
            } else if (nums[i] > cache[4]) {
                cache[2] = cache[3];
                cache[3] = cache[4];
                cache[4] = nums[i];
            } else if (nums[i] > cache[3]) {
                cache[2] = cache[3];
                cache[3] = nums[i];
            } else if (nums[i] > cache[2]) {
                cache[2] = nums[i];
            }
        }

        int a = cache[cache.length - 1] * cache[cache.length - 2] * cache[cache.length - 3];
        int b = cache[0] * cache[1] * cache[cache.length - 1];
        return Math.max(a, b);
    }
}
