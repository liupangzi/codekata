class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;
        int result = nums[0] > nums[1] ? 0 : 1, second = nums[0] > nums[1] ? 1 : 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[result]) {
                second = result;
                result = i;
            } else if (nums[i] > nums[second]) {
                second = i;
            }
        }
        return nums[result] >= 2 * nums[second] ? result : -1;
    }
}
