public class Solution {
    public int rob(int[] nums) {
        int i = 0, rob = 0, notRob = 0;
        while (i < nums.length) {
            int tmp = notRob;
            notRob = Math.max(rob, notRob);
            rob = nums[i++] + tmp;
        }
        return Math.max(rob, notRob);
    }
}
