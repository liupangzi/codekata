public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return (sum & 1) == 0 && helper(nums, 0, (sum >> 1));
    }

    private boolean helper(int[] nums, int begin, int target) {
        if (target <= 0 || begin >= nums.length) return target == 0;
        return helper(nums, begin + 1, target - nums[begin]) || helper(nums, begin + 1, target);
    }
}
