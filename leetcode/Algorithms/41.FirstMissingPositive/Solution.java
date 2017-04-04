public class Solution {
    public int firstMissingPositive(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            while (nums[index] > 0 && nums[index] <= nums.length && nums[nums[index] - 1] != nums[index]) {
                int tmp = nums[index];
                nums[index] = nums[nums[index] - 1];
                nums[tmp - 1] = tmp;
            }
            index++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return i + 1;
        }
        return nums.length + 1;
    }
}
