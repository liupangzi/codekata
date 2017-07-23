public class Solution {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int result = 0;
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0, k = j; k < s.length(); i++, k++) {
                if (s.charAt(i) == s.charAt(k) && (k - i < 3 || dp[i + 1][k - 1])) {
                    dp[i][k] = true;
                    result++;
                }
            }
        }
        return result;
    }
}
