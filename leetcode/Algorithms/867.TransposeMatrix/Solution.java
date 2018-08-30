class Solution {
    public int[][] transpose(int[][] A) {
        int w = A.length, h = A[0].length, result[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                result[i][j] = A[j][i];
            }
        }
        return result;
    }
}
