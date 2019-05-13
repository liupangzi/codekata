class Solution {
    public int[] sortedSquares(int[] A) {
        int start = 0, end = A.length - 1, cursor = A.length - 1;
        int[] result = new int[A.length];
        while (cursor >= 0) {
            if (A[start] * A[start] > A[end] * A[end]) {
                result[cursor--] = A[start] * A[start];
                start++;
            } else {
                result[cursor--] = A[end] * A[end];
                end--;
            }
        }
        return result;
    }
}