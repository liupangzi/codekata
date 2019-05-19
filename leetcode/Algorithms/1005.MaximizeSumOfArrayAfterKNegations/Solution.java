import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int result = 0, min = Integer.MAX_VALUE;
        for (int a : A) {
            if (a >= 0 || K == 0) {
                min = Math.min(min, a);
                result += a;
            } else {
                min = Math.min(min, -a);
                result -= a;
                K--;
            }
        }

        if ((K & 1) == 1) {
            result -= min * 2;
        }
        return result;
    }
}