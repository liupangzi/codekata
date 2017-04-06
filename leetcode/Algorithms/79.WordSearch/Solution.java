public class Solution {
    private boolean tmp[][];

    public boolean exist(char[][] board, String word) {
        if (board.length == 0) return false;
        tmp = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (search(board, word, i, j, 0)) return true;
            }
        }

        return false;
    }

    private boolean search(char[][] board, String word, int x, int y, int index) {
        if (tmp[x][y] || board[x][y] != word.charAt(index)) return false;
        if (index == word.length() - 1) return true;

        tmp[x][y] = true;
        if (x > 0 && search(board, word, x - 1, y, index + 1)) return true;
        if (y > 0 && search(board, word, x, y - 1, index + 1)) return true;
        if (x < board.length - 1 && search(board, word, x + 1, y, index + 1)) return true;
        if (y < board[0].length - 1 && search(board, word, x, y + 1, index + 1)) return true;
        tmp[x][y] = false;

        return false;
    }
}
