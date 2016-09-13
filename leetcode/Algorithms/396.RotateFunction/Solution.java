public class Solution {
    public int maxRotateFunction(int[] A) {
        if (A.length == 0) return 0;

        int length = A.length;
        int sum = 0;
        int result = 0;
        for (int i = 0; i < length; i++) {
            sum += A[i];
            result += i * A[i];
        }

        int record = result;
        for (int j = 1; j < length; j++) {
            record += sum - length * A[length - j];
            result = Math.max(result, record);
        }

        return result;
    }
}
