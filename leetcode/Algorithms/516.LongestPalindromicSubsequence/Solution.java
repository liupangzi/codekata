public class Solution {
    public int longestPalindromeSubseq(String s) {
        int length = s.length() + 1, table[][] = new int[length][length];
        for (int i = 1; i < length; i++) {
            for (int j = length - 2; j >= 0; j--) {
                if (s.charAt(i - 1) == s.charAt(j)) {
                    table[i][j] = table[i - 1][j + 1] + 1;
                } else {
                    table[i][j] = Math.max(table[i][j + 1], table[i - 1][j]);
                }
            }
        }
        return table[s.length()][0];
    }
}
