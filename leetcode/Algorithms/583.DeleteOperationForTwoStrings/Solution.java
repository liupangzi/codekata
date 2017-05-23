public class Solution {
    public int minDistance(String word1, String word2) {
        int height = word1.length() + 1, length = word2.length() + 1, table[][] = new int[height][length];
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < length; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1] + 1;
                } else {
                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                }
            }
        }
        return word1.length() + word2.length() - 2 * table[word1.length()][word2.length()];
    }
}
