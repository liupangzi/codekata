public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, start = 0;
        while (start < nums.length) {
            if (nums[start] == 0) {
                start++;
            } else {
                int tmp = start + 1;
                while (tmp < nums.length && nums[tmp] == 1) tmp++;
                result = Math.max(result, tmp - start);
                start = tmp + 1;
            }
        }
        return result;
    }
}
