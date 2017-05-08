public class NumMatrix {
    private int[][] cache;

    public NumMatrix(int[][] matrix) {
        if (matrix.length != 0) {
            cache = new int[matrix.length + 1][matrix[0].length + 1];
            for (int i = 1; i < matrix.length + 1; i++) {
                for (int j = 1; j < matrix[0].length + 1; j++) {
                    cache[i][j] = matrix[i - 1][j - 1] + cache[i - 1][j] + cache[i][j - 1] - cache[i - 1][j - 1];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return cache[row2 + 1][col2 + 1] - cache[row2 + 1][col1] - cache[row1][col2 + 1] + cache[row1][col1];
    }
}
