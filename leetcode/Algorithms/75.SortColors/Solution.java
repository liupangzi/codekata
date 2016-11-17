public class Solution {
    public void sortColors(int[] nums) {
        int start = 0, end = nums.length - 1;
        for (int i = 0; i <= end; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[start];
                nums[start++] = 0;
            } else if (nums[i] == 2) {
                nums[i--] = nums[end];
                nums[end--] = 2;
            }
        }
    }
}
