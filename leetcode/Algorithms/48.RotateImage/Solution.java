public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length, len = n - 1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; i + j < len; j++) {
                int tmp = matrix[i][i + j];
                matrix[i][i + j] = matrix[len - j][i];
                matrix[len - j][i] = matrix[len][len - j];
                matrix[len][len - j] = matrix[i + j][len];
                matrix[i + j][len] = tmp;
            }
            len--;
        }
    }
}
