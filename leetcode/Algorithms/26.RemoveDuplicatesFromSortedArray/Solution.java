public class Solution {
    public int removeDuplicates(int[] nums) {
        int offset = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) nums[offset++] = nums[i];
        }
        return offset;
    }
}
