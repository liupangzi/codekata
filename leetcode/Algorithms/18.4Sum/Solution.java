import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int l = nums.length;
        if (l < 4
                || nums[l - 1] + nums[l - 2] + nums[l - 3] + nums[l - 4] < target
                || nums[0] + nums[1] + nums[2] + nums[3] > target)
            return result;

        for (int i = 0; i < l - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < l - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;
                int sum = target - nums[i] - nums[j], start = j + 1, end = l - 1;
                while (start < end && (nums[start] + nums[start + 1] <= sum && nums[end] + nums[end - 1] >= sum)) {
                    if (nums[start] + nums[end] < sum) {
                        while (start + 1 < end && nums[start] == nums[start + 1]) start++;
                        start++;
                    } else if (nums[start] + nums[end] > sum) {
                        while (end - 1 > start && nums[end] == nums[end - 1]) end--;
                        end--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        while (end - 1 > start && nums[end] == nums[end - 1]) end--;
                        while (start + 1 < end && nums[start] == nums[start + 1]) start++;
                        end--;
                        start++;
                    }
                }
            }
        }
        return result;
    }
}
