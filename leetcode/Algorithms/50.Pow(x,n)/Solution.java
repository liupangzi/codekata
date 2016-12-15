public class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        long p = Math.abs((long) n);
        while (p != 0) {
            if ((p & 1) == 1) result *= x;
            x *= x;
            p >>= 1;
        }
        return n < 0 ? 1 / result : result;
    }
}
