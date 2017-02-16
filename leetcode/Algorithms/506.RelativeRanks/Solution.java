import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int count = nums.length, tmp[] = new int[count];
        System.arraycopy(nums, 0, tmp, 0, count);
        String[] prize = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};

        Arrays.sort(tmp);
        HashMap<Integer, Integer> cache = new HashMap<>();
        for (int n : tmp) cache.put(n, count--);

        String[] result = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int x = cache.get(nums[i]);
            result[i] = x <= 3 ? prize[x - 1] : String.valueOf(x);
        }
        return result;
    }
}
