class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        if (grid.length < 3 || grid[0].length < 3) return 0;
        int result = 0;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length - 1; j++) {
                result += check(grid, i, j);
            }
        }
        return result;
    }

    private int check(int[][] grid, int x, int y) {
        if (grid[x][y] != 5) return 0;
        int[] tmp = new int[10];

        if (grid[x - 1][y - 1] == 0 || grid[x - 1][y - 1] >= 10) return 0;
        tmp[grid[x - 1][y - 1]]++;
        if (grid[x - 1][y] == 0 || grid[x - 1][y] >= 10) return 0;
        tmp[grid[x - 1][y]]++;
        if (grid[x - 1][y + 1] == 0 || grid[x - 1][y + 1] >= 10) return 0;
        tmp[grid[x - 1][y + 1]]++;
        if (grid[x][y - 1] == 0 || grid[x][y - 1] >= 10) return 0;
        tmp[grid[x][y - 1]]++;
        if (grid[x][y + 1] == 0 || grid[x][y + 1] >= 10) return 0;
        tmp[grid[x][y + 1]]++;
        if (grid[x + 1][y - 1] == 0 || grid[x + 1][y - 1] >= 10) return 0;
        tmp[grid[x + 1][y - 1]]++;
        if (grid[x + 1][y] == 0 || grid[x + 1][y] >= 10) return 0;
        tmp[grid[x + 1][y]]++;
        if (grid[x + 1][y + 1] == 0 || grid[x + 1][y + 1] >= 10) return 0;
        tmp[grid[x + 1][y + 1]]++;

        if (grid[x - 1][y - 1] + grid[x - 1][y] + grid[x - 1][y + 1] != 15) return 0;
        if (grid[x][y - 1] + grid[x][y] + grid[x][y + 1] != 15) return 0;
        if (grid[x + 1][y - 1] + grid[x + 1][y] + grid[x + 1][y + 1] != 15) return 0;

        if (grid[x - 1][y - 1] + grid[x][y - 1] + grid[x + 1][y - 1] != 15) return 0;
        if (grid[x - 1][y] + grid[x][y] + grid[x + 1][y] != 15) return 0;
        if (grid[x - 1][y + 1] + grid[x][y + 1] + grid[x + 1][y + 1] != 15) return 0;

        if (grid[x - 1][y - 1] + grid[x][y] + grid[x + 1][y + 1] != 15) return 0;
        if (grid[x - 1][y + 1] + grid[x][y] + grid[x + 1][y - 1] != 15) return 0;

        if (tmp[1] == 1 && tmp[2] == 1 && tmp[3] == 1 && tmp[4] == 1 && tmp[6] == 1 && tmp[7] == 1 && tmp[8] == 1 && tmp[9] == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
