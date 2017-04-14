public class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
        } else {
            travel(board, click[0], click[1]);
        }
        return board;
    }

    private void travel(char[][] board, int x, int y) {
        int sum = count(board, x, y);
        if (sum != 0) {
            board[x][y] = (char) (sum + 48);
        } else {
            board[x][y] = 'B';
            if (x > 0 && y > 0 && board[x - 1][y] == 'E') travel(board, x - 1, y - 1);
            if (x > 0 && board[x - 1][y] == 'E') travel(board, x - 1, y);
            if (x > 0 && y + 1 < board[0].length && board[x - 1][y + 1] == 'E') travel(board, x - 1, y + 1);
            if (y > 0 && board[x][y - 1] == 'E') travel(board, x, y - 1);
            if (y + 1 < board[0].length && board[x][y + 1] == 'E') travel(board, x, y + 1);
            if (x + 1 < board.length && y > 0 && board[x + 1][y - 1] == 'E') travel(board, x + 1, y - 1);
            if (x + 1 < board.length && board[x + 1][y] == 'E') travel(board, x + 1, y);
            if (x + 1 < board.length && y + 1 < board[0].length && board[x + 1][y + 1] == 'E')
                travel(board, x + 1, y + 1);
        }
    }

    private int count(char[][] board, int x, int y) {
        int sum = 0;
        if (x > 0 && board[x - 1][y] == 'M') sum++;
        if (x > 0 && y > 0 && board[x - 1][y - 1] == 'M') sum++;
        if (x > 0 && y + 1 < board[0].length && board[x - 1][y + 1] == 'M') sum++;
        if (y > 0 && board[x][y - 1] == 'M') sum++;
        if (y + 1 < board[0].length && board[x][y + 1] == 'M') sum++;
        if (x + 1 < board.length && board[x + 1][y] == 'M') sum++;
        if (x + 1 < board.length && y > 0 && board[x + 1][y - 1] == 'M') sum++;
        if (x + 1 < board.length && y + 1 < board[0].length && board[x + 1][y + 1] == 'M') sum++;
        return sum;
    }
}
