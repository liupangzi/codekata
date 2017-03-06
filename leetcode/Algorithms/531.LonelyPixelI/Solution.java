public class Solution {
    public int findLonelyPixel(char[][] picture) {
        int m = picture.length, n = picture[0].length, line[] = new int[m], row[] = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] == 'B') {
                    line[i]++;
                    row[j]++;
                }
            }
        }

        int result = 0;
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (picture[x][y] == 'B' && line[x] == 1 && row[y] == 1) result++;
            }
        }
        return result;
    }
}
