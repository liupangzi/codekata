public class Solution {
    public int totalHammingDistance(int[] nums) {
        int result = 0, len = nums.length;
        for (int i = 0; i < 32; i++) {
            int odd = 0;
            for (int k = 0; k < len; k++) {
                if ((nums[k] & 1) == 1) odd++;
                nums[k] >>= 1;
            }
            result += odd * (len - odd);
        }
        return result;
    }
}
