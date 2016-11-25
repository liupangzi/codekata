public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int height = matrix.length, width = matrix[0].length, low = 0, high = height * width - 1;
        while (low < high) {
            int mid = (high + low) >> 1;
            if (matrix[mid / width][mid % width] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return matrix[low / width][low % width] == target;
    }
}
