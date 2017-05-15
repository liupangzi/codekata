import java.util.Arrays;

public class Solution {
    private int[] cache;

    public int combinationSum4(int[] nums, int target) {
        cache = new int[target];
        Arrays.fill(cache, -1);
        return helper(nums, target);
    }

    private int helper(int[] nums, int target) {
        int result = 0;
        for (int num : nums) {
            if (target == num) {
                result++;
            } else if (target > num) {
                if (cache[target - num] == -1) cache[target - num] = helper(nums, target - num);
                result += cache[target - num];
            }
        }
        return result;
    }
}
