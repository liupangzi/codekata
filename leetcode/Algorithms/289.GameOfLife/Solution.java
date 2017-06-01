public class Solution {
    public void gameOfLife(int[][] board) {
        if (board.length == 0) return;

        int height = board.length, length = board[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                int neighbors = 0;
                if (i > 0 && j > 0) neighbors += board[i - 1][j - 1] & 1;
                if (i > 0) neighbors += board[i - 1][j] & 1;
                if (i > 0 && j + 1 < length) neighbors += board[i - 1][j + 1] & 1;
                if (j > 0) neighbors += board[i][j - 1] & 1;
                if (j + 1 < length) neighbors += board[i][j + 1] & 1;
                if (i + 1 < height && j > 0) neighbors += board[i + 1][j - 1] & 1;
                if (i + 1 < height) neighbors += board[i + 1][j] & 1;
                if (i + 1 < height && j + 1 < length) neighbors += board[i + 1][j + 1] & 1;

                if ((board[i][j] & 1) == 1 && (neighbors == 2 || neighbors == 3)) board[i][j] += 2;
                if ((board[i][j] & 1) == 0 && neighbors == 3) board[i][j] += 2;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                board[i][j] >>= 1;
            }
        }
    }
}
