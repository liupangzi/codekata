public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int cur = 0, result = 0;

        for (int i = 2, length = A.length; i < length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                cur += 1;
                result += cur;
            } else {
                cur = 0;
            }
        }

        return result;
    }
}
