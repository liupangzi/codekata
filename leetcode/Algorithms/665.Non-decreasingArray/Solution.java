class Solution {
    public boolean checkPossibility(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > nums[i + 1]) {
                if (nums[i] <= nums[i + 2] && helper(nums, i + 2)) return true;
                return i == 0 ? helper(nums, 1) : nums[i - 1] <= nums[i + 1] && helper(nums, i + 1);
            }
        }
        return true;
    }

    private boolean helper(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) return false;
        }
        return true;
    }
}
