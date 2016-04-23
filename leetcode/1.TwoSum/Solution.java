import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needle = target - nums[i];
            if (data.containsKey(needle)) {
                result[0] = data.get(needle);
                result[1] = i;
                break;
            }
            else {
                data.put(nums[i], i);
            }
        }

        return result;
    }
}
