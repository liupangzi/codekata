public class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    travel(grid, i, j);
                }
            }
        }
        return result;
    }

    private void travel(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        if (i > 0 && grid[i - 1][j] == '1') travel(grid, i - 1, j);  // up
        if (j + 1 < grid[i].length && grid[i][j + 1] == '1') travel(grid, i, j + 1); // right
        if (i + 1 < grid.length && grid[i + 1][j] == '1') travel(grid, i + 1, j); // down
        if (j > 0 && grid[i][j - 1] == '1') travel(grid, i, j - 1); // left
    }
}
