class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = A[0], min = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            } else if (A[i] < min) {
                min = A[i];
            }
        }
        return Math.max(0, max - min - 2 * K);
    }
}
