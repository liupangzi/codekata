class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1, start = 0, end = 0, result = 0;
        while (start < nums.length || end < nums.length) {
            if (product >= k) {
                if (start == end) {
                    start++;
                    end++;
                } else {
                    result += end - start - 1;
                    product /= nums[start++];
                }
            } else {
                if (end == nums.length) {
                    result += end - start;
                    start++;
                } else {
                    product *= nums[end++];
                }
            }
        }
        return result;
    }
}
