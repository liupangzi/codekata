public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int matrix[][] = new int[m + 1][n + 1], result = 0;
        for (String s : strs) {
            int zero = countZero(s), one = s.length() - zero;
            for (int i = m - zero; i >= 0; i--) {
                for (int j = n - one; j >= 0; j--) {
                    matrix[i + zero][j + one] = Math.max(matrix[i][j] + 1, matrix[i + zero][j + one]);
                    result = Math.max(matrix[i + zero][j + one], result);
                }
            }
        }
        return result;
    }

    private int countZero(String s) {
        int result = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') result++;
        }
        return result;
    }
}
