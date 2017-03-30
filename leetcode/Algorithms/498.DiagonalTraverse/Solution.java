public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length, n = m == 0 ? 0 : matrix[0].length, result[] = new int[m * n], index = 0;

        for (int i = 0; i < m + n - 1; i++) {
            int startX = (i & 1) == 0 ? Math.min(i, m - 1) : Math.max(0, i - n + 1);
            int endX = (i & 1) == 0 ? Math.max(0, i - n + 1) : Math.min(i, m - 1);
            int delta = (i & 1) == 0 ? -1 : 1;
            while (startX != endX) {
                result[index++] = matrix[startX][i - startX];
                startX += delta;
            }
            result[index++] = matrix[endX][i - endX];
        }

        return result;
    }
}
