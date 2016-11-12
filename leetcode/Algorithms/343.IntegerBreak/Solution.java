public class Solution {
    public int integerBreak(int n) {
        if (n < 4) return n - 1;
        int result = 1;
        while (n > 4) {
            result *= 3;
            n -= 3;
        }
        return result * n;
    }
}
