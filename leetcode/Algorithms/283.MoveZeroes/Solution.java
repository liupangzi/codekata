public class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        for (int n: nums) {
            if (n != 0) {
                nums[start] = n;
                start++;
            }
        }

        for (; start < nums.length; start++) {
            nums[start] = 0;
        }
    }
}
