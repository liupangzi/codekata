class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) result = Math.max(result, helper(grid, i, j));
            }
        }
        return result;
    }

    private int helper(int[][] grid, int x, int y) {
        int result = 1;
        grid[x][y] = 0;
        if (x > 0 && grid[x - 1][y] == 1) result += helper(grid, x - 1, y);
        if (y > 0 && grid[x][y - 1] == 1) result += helper(grid, x, y - 1);
        if (x + 1 < grid.length && grid[x + 1][y] == 1) result += helper(grid, x + 1, y);
        if (y + 1 < grid[0].length && grid[x][y + 1] == 1) result += helper(grid, x, y + 1);
        return result;
    }
}
