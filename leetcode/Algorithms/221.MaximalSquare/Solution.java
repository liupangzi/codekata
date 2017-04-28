public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int result = 0, tmp[][] = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 1; i < tmp.length; i++) {
            for (int j = 1; j < tmp[0].length; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    tmp[i][j] = Math.min(Math.min(tmp[i][j - 1], tmp[i - 1][j]), tmp[i - 1][j - 1]) + 1;
                    result = Math.max(result, tmp[i][j]);
                }
            }
        }
        return result * result;
    }
}
