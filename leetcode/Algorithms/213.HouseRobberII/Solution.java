public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(nums[0] + rob(nums, 2, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int start, int end) {
        int rob = 0, notRob = 0;
        for (int i = start; i <= end; i++) {
            int tmp = notRob;
            notRob = Math.max(notRob, rob);
            rob = nums[i] + tmp;
        }
        return Math.max(rob, notRob);
    }
}
