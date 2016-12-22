import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - 1 != i && nums[nums[i] - 1] != nums[i]) {
                int v = nums[i];
                nums[i] = nums[v - 1];
                nums[v - 1] = v;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) result.add(nums[k]);
        }
        return result;
    }
}
