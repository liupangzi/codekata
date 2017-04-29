public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0 || r <= 0 || c <= 0 || nums.length * nums[0].length != r * c || r == nums.length)
            return nums;

        int result[][] = new int[r][c], row = 0, col = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = nums[row][col++];
                if (col == nums[0].length) {
                    row++;
                    col = 0;
                }
            }
        }
        return result;
    }
}
