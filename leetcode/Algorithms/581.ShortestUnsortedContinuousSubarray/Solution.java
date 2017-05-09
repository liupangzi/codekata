import java.util.Arrays;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int start = 0, end = nums.length - 1;
        while (start < nums.length && sorted[start] == nums[start]) start++;
        while (end > start && sorted[end] == nums[end]) end--;
        return end - start + 1;
    }
}
