class Solution {
    public int[][] candyCrush(int[][] board) {
        while (check(board)) {
            clear(board);
        }
        return board;
    }

    private boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) continue;
                if (i + 2 < board.length &&
                        Math.abs(board[i][j]) == Math.abs(board[i + 1][j]) &&
                        Math.abs(board[i + 1][j]) == Math.abs(board[i + 2][j])) {
                    result = true;
                    board[i][j] = -Math.abs(board[i][j]);
                    board[i + 1][j] = -Math.abs(board[i][j]);
                    board[i + 2][j] = -Math.abs(board[i][j]);
                }

                if (j + 2 < board[0].length &&
                        Math.abs(board[i][j]) == Math.abs(board[i][j + 1]) &&
                        Math.abs(board[i][j + 1]) == Math.abs(board[i][j + 2])) {
                    result = true;
                    board[i][j] = -Math.abs(board[i][j]);
                    board[i][j + 1] = -Math.abs(board[i][j]);
                    board[i][j + 2] = -Math.abs(board[i][j]);
                }
            }
        }
        return result;
    }

    private void clear(int[][] board) {
        for (int j = 0; j < board[0].length; j++) {
            int start = board.length - 1, end = board.length - 1;
            while (start >= 0 && end >= 0) {
                if (board[end][j] < 0) {
                    end--;
                } else {
                    board[start--][j] = board[end--][j];
                }
            }
            while (start >= 0) board[start--][j] = 0;
        }
    }
}
