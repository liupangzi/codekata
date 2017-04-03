public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int num : nums) {
                if ((num >> i & 1) == 1) count++;
            }
            count %= 3;
            result |= count << i;
        }
        return result;
    }
}
