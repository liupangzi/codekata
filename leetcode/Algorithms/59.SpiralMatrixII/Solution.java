public class Solution {
    public int[][] generateMatrix(int n) {
        int result[][] = new int[n][n], left = 0, right = n, down = n, up = 0, tmp = 0;

        while (left < right || up < down) {
            if (down != up) {
                for (int i = left; i < right; i++) result[up][i] = ++tmp;
                up++;
            }

            if (right != left) {
                for (int j = up; j < down; j++) result[j][right - 1] = ++tmp;
                right--;
            }

            if (down != up) {
                for (int i = right - 1; i >= left; i--) result[down - 1][i] = ++tmp;
                down--;
            }

            if (right != left) {
                for (int j = down - 1; j >= up; j--) result[j][left] = ++tmp;
                left++;
            }
        }

        return result;
    }
}
