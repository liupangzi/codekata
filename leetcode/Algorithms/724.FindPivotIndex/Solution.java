class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, left = 0;
        for (int num : nums) sum += num;
        for (int i = 0; i < nums.length; i++) {
            if (left * 2 + nums[i] == sum) return i;
            left += nums[i];
        }
        return -1;
    }
}
