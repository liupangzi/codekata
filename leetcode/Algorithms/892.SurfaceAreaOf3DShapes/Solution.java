class Solution {
    public int surfaceArea(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                result += i == 0 ? grid[0][j] : Math.abs(grid[i][j] - grid[i - 1][j]);
                if (i == grid.length - 1) result += grid[i][j];
                result += j == 0 ? grid[i][0] : Math.abs(grid[i][j] - grid[i][j - 1]);
                if (j == grid.length - 1) result += grid[i][j];
                if (grid[i][j] > 0) result += 2;
            }
        }
        return result;
    }
}
