class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int start = 0, end = A[i].length - 1;
            while (start <= end) {
                int tmp = A[i][start];
                A[i][start] = A[i][end] ^ 1;
                A[i][end] = tmp ^ 1;
                start++;
                end--;
            }
        }
        return A;
    }
}
