class Solution {
    public int projectionArea(int[][] grid) {
        int result = 0, length = grid.length;
        for (int i = 0; i < length; i++) {
            int maxRow = 0, maxLine = 0;
            for (int j = 0; j < length; j++) {
                if (grid[i][j] > 0) {
                    result++;
                    maxRow = Math.max(maxRow, grid[i][j]);
                }
                maxLine = Math.max(maxLine, grid[j][i]);
            }
            result += maxRow + maxLine;
        }
        return result;
    }
}
