class Solution {
    private int result = 0;

    public int largestOverlap(int[][] A, int[][] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                int up = Math.max(upLeft(i, j, A, B), upRight(i, j, A, B));
                int down = Math.max(downLeft(i, j, A, B), downRight(i, j, A, B));
                int max = Math.max(up, down);
                result = Math.max(max, result);
            }
        }
        return result;
    }

    private int upLeft(int x, int y, int[][] A, int[][] B) {
        if ((x + 1) * (y + 1) <= result) return 0;
        int count = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                count += A[i][j] & B[B.length - 1 - x + i][B[0].length - 1 - y + j];
            }
        }
        return count;
    }

    private int upRight(int x, int y, int[][] A, int[][] B) {
        if ((x + 1) * (B.length - y) <= result) return 0;
        int count = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = y; j < B[0].length; j++) {
                count += A[i][j] & B[B.length - 1 + i - x][j - y];
            }
        }
        return count;
    }

    private int downLeft(int x, int y, int[][] A, int[][] B) {
        if ((B.length - x) * (y + 1) <= result) return 0;
        int count = 0;
        for (int i = x; i < A.length; i++) {
            for (int j = 0; j <= y; j++) {
                count += A[i][j] & B[i - x][B[0].length - 1 + j - y];
            }
        }
        return count;
    }

    private int downRight(int x, int y, int[][] A, int[][] B) {
        if ((B.length - x) * (B[0].length - y) <= result) return 0;
        int count = 0;
        for (int i = x; i < A.length; i++) {
            for (int j = y; j < A[0].length; j++) {
                count += A[i][j] & B[i - x][j - y];
            }
        }
        return count;
    }
}
