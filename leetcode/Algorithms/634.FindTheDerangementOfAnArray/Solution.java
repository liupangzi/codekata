public class Solution {
    public int findDerangement(int n) {
        if (n < 3) return n - 1;
        long a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            long next = (i - 1) * ((a + b) % 1000000007);
            a = b;
            b = next % 1000000007;
        }
        return (int) b % 1000000007;
    }
}
