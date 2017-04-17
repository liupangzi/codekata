public class Solution {
    public int checkRecord(int n) {
        long table[] = new long[Math.max(n + 1, 3)], ppORpl = 1L, lp = 1L, ll = 1L;
        table[0] = 1L;
        table[1] = 2L;
        table[2] = 4L;
        for (int i = 3; i <= n; i++) {
            long nextP = (ppORpl + lp) % 1000000007L, nextLP = (ppORpl + ll) % 1000000007L, nextLL = ppORpl;
            table[i] = ((nextP << 1) + nextLP + nextLL) % 1000000007L;
            ppORpl = nextP;
            lp = nextLP;
            ll = nextLL;
        }

        long result = table[n];
        for (int i = 0; i <= n - 1; i++) {
            result += (table[i] * table[n - i - 1]) % 1000000007L;
            result %= 1000000007L;
        }
        return (int) result;
    }
}
