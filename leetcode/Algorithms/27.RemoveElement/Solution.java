public class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != val)
                nums[result++] = nums[i];
        return result;
    }
}
