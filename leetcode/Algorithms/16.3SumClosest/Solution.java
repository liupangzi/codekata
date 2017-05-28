import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int tmp = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) > Math.abs(target - tmp)) sum = tmp;
                if (target - tmp > 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return sum;
    }
}
