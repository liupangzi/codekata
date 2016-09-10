public class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;

        int[] cache = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (cache[s.charAt(i) - 'a'] == 1) continue;
            cache[s.charAt(i) - 'a'] = 1;
            if (countMatches(s, s.charAt(i) + "") < k) {
                int max = 0;
                for (String tmpString: s.split(s.charAt(i) + "")) {
                    max = Math.max(max, longestSubstring(tmpString, k));
                }
                return max;
            }
        }

        return s.length();
    }
    
    private static int countMatches(String str, String sub) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
}
