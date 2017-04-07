import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length || nums[i + 1] != nums[i] + 1) {
                if (i == index) {
                    result.add(String.valueOf(nums[index]));
                } else {
                    result.add(String.valueOf(nums[index] + "->" + String.valueOf(nums[i])));
                }
                index = i + 1;
            }
        }
        return result;
    }
}
