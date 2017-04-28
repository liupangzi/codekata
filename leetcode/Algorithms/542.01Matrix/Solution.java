public class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        if (matrix.length == 0) return matrix;
        int height = matrix.length, length = matrix[0].length, MAGIC = 250;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (matrix[i][j] != 0) matrix[i][j] = MAGIC;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (matrix[i][j] == 0) DFS(matrix, i, j, 0);
            }
        }

        return matrix;
    }

    private void DFS(int[][] matrix, int i, int j, int weight) {
        matrix[i][j] = weight++;
        if (i > 0 && matrix[i - 1][j] > weight) DFS(matrix, i - 1, j, weight);
        if (j > 0 && matrix[i][j - 1] > weight) DFS(matrix, i, j - 1, weight);
        if (i + 1 < matrix.length && matrix[i + 1][j] > weight) DFS(matrix, i + 1, j, weight);
        if (j + 1 < matrix[0].length && matrix[i][j + 1] > weight) DFS(matrix, i, j + 1, weight);
    }
}
