import java.util.HashMap;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) sum %= k;
            Integer prev = map.getOrDefault(sum, null);
            if (prev != null) {
                if (i - prev > 1) return true;
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
}
