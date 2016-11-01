public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] column = new int[9][9];
        int[][][] block = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (row[j][board[i][j] - 1 - '0']++ != 0) return false;
                if (column[i][board[i][j] - 1 - '0']++ != 0) return false;
                if (block[i / 3][j / 3][board[i][j] - 1 - '0']++ != 0) return false;
            }
        }
        return true;
    }
}
