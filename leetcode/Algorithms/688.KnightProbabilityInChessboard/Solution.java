class Solution {
    public double knightProbability(int N, int K, int r, int c) {
        double matrix[][] = new double[N][N];
        matrix[r][c] = 1.0;

        while (K-- > 0) {
            double tmp[][] = new double[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (matrix[i][j] != 0.0) {
                        if ((i + 1 < N) && (j + 2 < N)) tmp[i + 1][j + 2] += matrix[i][j] * 0.125;
                        if ((i + 1 < N) && (j - 2 >= 0)) tmp[i + 1][j - 2] += matrix[i][j] * 0.125;
                        if ((i + 2 < N) && (j + 1 < N)) tmp[i + 2][j + 1] += matrix[i][j] * 0.125;
                        if ((i + 2 < N) && (j - 1 >= 0)) tmp[i + 2][j - 1] += matrix[i][j] * 0.125;
                        if ((i - 1 >= 0) && (j - 2 >= 0)) tmp[i - 1][j - 2] += matrix[i][j] * 0.125;
                        if ((i - 1 >= 0) && (j + 2 < N)) tmp[i - 1][j + 2] += matrix[i][j] * 0.125;
                        if ((i - 2 >= 0) && (j - 1 >= 0)) tmp[i - 2][j - 1] += matrix[i][j] * 0.125;
                        if ((i - 2 >= 0) && (j + 1 < N)) tmp[i - 2][j + 1] += matrix[i][j] * 0.125;
                    }
                }
            }
            matrix = tmp;
        }

        double result = 0;
        for (double[] line : matrix) {
            for (double d : line) result += d;
        }
        return result;
    }
}
