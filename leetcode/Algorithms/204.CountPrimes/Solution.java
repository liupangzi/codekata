public class Solution {
    public int countPrimes(int n) {
        // bucket[i] == false means number (2i + 3) is prime.
        int size = Math.max((int) Math.ceil((double) (n - 3) / 2), 0);
        int boundary = (int) Math.sqrt((double) n - 1);

        boolean[] bucket = new boolean[size];
        int i = 0;
        while (i * 2 + 3 <= boundary) {
            if (!bucket[i]) {
                int tmp = (i * 2 + 3) * (i * 2 + 1);
                while ((tmp += i * 4 + 6) < n) bucket[(tmp - 3) / 2] = true;
            }
            i++;
        }

        // consider number (2).
        int result = 1;
        for (boolean b: bucket) {
            if (!b) result++;
        }
        return n < 3 ? result - 1 : result;
    }
}
