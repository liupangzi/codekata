import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.emptyList());
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = result.size();
            for (int j = offset; j < count; j++) {
                List<Integer> tmp = new ArrayList<>(result.get(j));
                tmp.add(nums[i]);
                result.add(tmp);
            }
            offset = (i + 1 < nums.length && nums[i] != nums[i + 1]) ? 0 : count;
        }
        return result;
    }
}
