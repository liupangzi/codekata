import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        int left = 0, right = matrix[0].length, down = matrix.length, up = 0;

        while (left < right || up < down) {
            if (down != up) {
                for (int i = left; i < right; i++) result.add(matrix[up][i]);
                up++;
            }

            if (right != left) {
                for (int j = up; j < down; j++) result.add(matrix[j][right - 1]);
                right--;
            }

            if (down != up) {
                for (int i = right - 1; i >= left; i--) result.add(matrix[down - 1][i]);
                down--;
            }

            if (right != left) {
                for (int j = down - 1; j >= up; j--) result.add(matrix[j][left]);
                left++;
            }
        }

        return result;
    }
}
