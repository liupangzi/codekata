public class Solution {
    public int smallestFactorization(int a) {
        if (a == 1) return 1;
        long result = 0, base = 1;
        for (int i = 9; i > 1; i--) {
            while (a % i == 0) {
                result += i * base;
                base *= 10;
                a /= i;
            }
        }
        return a == 1 && result <= Integer.MAX_VALUE ? (int) result : 0;
    }
}
