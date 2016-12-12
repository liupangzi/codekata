public class Solution {
    public int countDigitOne(int n) {
        if (n < 1) return 0;

        int result = 0, cur = n;
        long base = 1;
        while (cur != 0) {
            result += (n / (base * 10)) * base + Math.max(Math.min((n % (base * 10)) - (base - 1), base), 0);
            base *= 10;
            cur /= 10;
        }

        return result;
    }
}
