public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) return 0;

        long a = Math.abs((long) dividend), b = Math.abs((long) divisor), result = 0;
        while (b <= a) {
            long cur = b, base = 1;
            while ((cur << 1) < a) {
                cur <<= 1;
                base <<= 1;
            }
            result += base;
            a -= cur;
        }

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) result = -result;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return Integer.MAX_VALUE;
        return (int) result;
    }
}
