public class Solution {
    public int missingNumber(int[] nums) {
        int result = 0, length = nums.length;
        for (int i = 0; i < length; i++) {
            result ^= i ^ nums[i];
        }
        return result ^ length;
    }
}
