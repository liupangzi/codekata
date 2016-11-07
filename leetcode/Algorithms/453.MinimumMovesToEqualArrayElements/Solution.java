public class Solution {
    public int minMoves(int[] nums) {
        int sum = 0, min = nums[0];

        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
        }

        return sum - nums.length * min;
    }
}
