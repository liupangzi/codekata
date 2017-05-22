import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            if (map.containsKey(key + 1)) {
                result = Math.max(result, entry.getValue() + map.get(key + 1));
            }
        }
        return result;
    }
}
