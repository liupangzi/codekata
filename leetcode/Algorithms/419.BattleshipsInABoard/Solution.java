public class Solution {
    public int countBattleships(char[][] board) {
        int m = board.length, n = board[0].length, count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X' 
                        && (i == 0 || board[i - 1][j] != 'X') 
                        && (j == 0 || board[i][j - 1] != 'X')) {
                    count++;
                }
            }
        }

        return count;
    }
}
