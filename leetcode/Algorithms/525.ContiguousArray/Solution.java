import java.util.HashMap;

public class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int countOfOne = 0, result = 0;
        for (int i = 0; i < nums.length; i++) {
            countOfOne += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(countOfOne)) {
                result = Math.max(i - map.get(countOfOne), result);
            } else {
                map.put(countOfOne, i);
            }
        }
        return result;
    }
}
