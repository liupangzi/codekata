import java.util.Arrays;

public class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int start = 0, end = 1, result = 0;
        while (start < nums.length && end < nums.length) {
            if (start == end || nums[start] + k > nums[end]) {
                end++;
            } else if (nums[start] + k < nums[end]) {
                start++;
            } else {
                start++;
                result++;
                while (start < nums.length && nums[start] == nums[start - 1]) start++;
                end = Math.max(end + 1, start + 1);
            }
        }
        return result;
    }
}
