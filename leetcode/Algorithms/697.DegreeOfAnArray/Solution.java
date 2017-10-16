import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> first = new HashMap<>(), last = new HashMap<>(), count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!first.containsKey(nums[i])) first.put(nums[i], i);
            last.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        int max = 0, result = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > max) {
                result = last.get(entry.getKey()) - first.get(entry.getKey()) + 1;
                max = entry.getValue();
            } else if (entry.getValue() == max) {
                result = Math.min(result, last.get(entry.getKey()) - first.get(entry.getKey()) + 1);
            }
        }
        return result;
    }
}
