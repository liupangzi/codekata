class Solution {
    public int[][] imageSmoother(int[][] M) {
        int height = M.length, width = M[0].length, result[][] = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int count = 0, sum = 0;
                if (i >= 1 && j >= 1) { count++; sum += M[i - 1][j - 1]; }
                if (i >= 1) { count++; sum += M[i - 1][j]; }
                if (i >= 1 && j + 1 < width) { count++; sum += M[i - 1][j + 1]; }
                if (j >= 1) { count++; sum += M[i][j - 1]; }
                count++; sum += M[i][j];
                if (j + 1 < width) { count++; sum += M[i][j + 1]; }
                if (i + 1 < height && j >= 1) { count++; sum += M[i + 1][j - 1]; }
                if (i + 1 < height) { count++; sum += M[i + 1][j]; }
                if (i + 1 < height && j + 1 < width) { count++; sum += M[i + 1][j + 1]; }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}
