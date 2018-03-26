class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] left = new int[grid.length], up = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                left[i] = Math.max(left[i], grid[i][j]);
                up[j] = Math.max(up[j], grid[i][j]);
            }
        }

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                result += Math.min(left[i], up[j]) - grid[i][j];
            }
        }
        return result;
    }
}
