public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int step[] = new int[primes.length], table[] = new int[n], index = 0;
        table[index] = 1;
        while (++index < n) {
            table[index] = Integer.MAX_VALUE;
            for (int i = 0; i < primes.length; i++) {
                table[index] = Math.min(table[step[i]] * primes[i], table[index]);
            }

            for (int j = 0; j < step.length; j++) {
                if (table[index] == table[step[j]] * primes[j]) step[j]++;
            }
        }
        return table[n - 1];
    }
}
