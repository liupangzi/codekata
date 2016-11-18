public class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (result < 2 || num > nums[result - 2]) nums[result++] = num;
        }
        return result;
    }
}
