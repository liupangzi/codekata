class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] cache = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache[i].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    cache[i][j] = cache[i][j - 1] + s2.charAt(j - 1);
                } else if (j == 0) {
                    cache[i][j] = cache[i - 1][j] + s1.charAt(i - 1);
                } else {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        cache[i][j] = cache[i - 1][j - 1];
                    } else {
                        cache[i][j] = Math.min(cache[i - 1][j] + s1.charAt(i - 1), cache[i][j - 1] + s2.charAt(j - 1));
                    }
                }
            }
        }
        return cache[s1.length()][s2.length()];
    }
}
