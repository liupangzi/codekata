public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int n : nums) xor ^= n;

        int bit = xor & ~(xor - 1), num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & bit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{num1, num2};
    }
}
