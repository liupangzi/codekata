class Solution {
    public int numRookCaptures(char[][] board) {
        int i = 0, j = 0;
        for (int m = 0; m < board.length; m++) {
            for (int n = 0; n < board[m].length; n++) {
                if (board[m][n] == 'R') {
                    i = m;
                    j = n;
                }
            }
        }

        int result = 0;

        for (int p = i - 1; p >= 0; p--) {
            if (board[p][j] == '.') continue;
            if (board[p][j] == 'p') result++;
            break;
        }

        for (int p = i + 1; p < 8; p++) {
            if (board[p][j] == '.') continue;
            if (board[p][j] == 'p') result++;
            break;
        }

        for (int p = j - 1; p >= 0; p--) {
            if (board[i][p] == '.') continue;
            if (board[i][p] == 'p') result++;
            break;
        }

        for (int p = j + 1; p < 8; p++) {
            if (board[i][p] == '.') continue;
            if (board[i][p] == 'p') result++;
            break;
        }

        return result;
    }
}