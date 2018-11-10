class Solution {
    public int minFallingPathSum(int[][] A) {
        int l = A.length;
        for (int i = 1; i < l; i++) {
            for (int j = 0; j < l; j++) {
                int min = A[i - 1][j];
                if (j != 0) min = Math.min(min, A[i - 1][j - 1]);
                if (j != l - 1) min = Math.min(min, A[i - 1][j + 1]);
                A[i][j] += min;
            }
        }

        int result = A[l - 1][0];
        for (int k = 1; k < l; k++) {
            result = Math.min(result, A[l - 1][k]);
        }
        return result;
    }
}
