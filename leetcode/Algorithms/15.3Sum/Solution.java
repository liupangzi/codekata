import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        int index = 0;
        while (index < nums.length - 2) {
            int start = index + 1, end = nums.length - 1, v = nums[index];
            while (start < end) {
                int s = nums[start], e = nums[end], sum = s + e + v;
                if (sum == 0) {
                    result.add(Arrays.asList(v, s, e));
                    while (start < end && nums[start] == s) start++;
                    while (start < end && nums[end] == e) end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
            while (index < nums.length && nums[index] == v) index++;
        }
        return result;
    }
}
