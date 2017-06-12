import java.util.Arrays;

public class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0, cursor = 0;
        while (cursor < nums.length && nums[cursor] == 0) cursor++;
        for (int i = cursor; i < nums.length - 2; i++) {
            int start = i + 1;
            while (start < nums.length - 1) {
                int end = start;
                while (end < nums.length && nums[end] - nums[start] < nums[i]) end++;
                result += end - start - 1;
                start++;
            }
        }
        return result;
    }
}
