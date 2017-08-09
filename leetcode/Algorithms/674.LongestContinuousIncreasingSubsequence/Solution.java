class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int result = 0, tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] <= nums[i - 1]) {
                result = Math.max(result, tmp);
                tmp = 1;
            } else {
                tmp++;
            }
        }
        return Math.max(result, tmp);
    }
}
