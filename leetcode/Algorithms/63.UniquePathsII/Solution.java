public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0) return 0;
        int[][] tmp = new int[obstacleGrid.length][obstacleGrid[0].length];
        tmp[0][0] = (obstacleGrid[0][0] + 1) & 1;
        int i = 1, j = 1;
        while (i < obstacleGrid.length && obstacleGrid[i][0] == 0 && tmp[i - 1][0] == 1) tmp[i++][0] = 1;
        while (j < obstacleGrid[0].length && obstacleGrid[0][j] == 0 && tmp[0][j - 1] == 1) tmp[0][j++] = 1;

        for (int m = 1; m < obstacleGrid[0].length; m++) {
            for (int n = 1; n < obstacleGrid.length; n++) {
                tmp[n][m] = obstacleGrid[n][m] == 1 ? 0 : tmp[n - 1][m] + tmp[n][m - 1];
            }
        }
        return tmp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
