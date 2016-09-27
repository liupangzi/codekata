public class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;

        int[] count = new int[26];
        for (char c: s.toCharArray()) {
            count[c - 'a']++;
        }

        List<String> badChars = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] < k && count[i] != 0) badChars.add(String.valueOf((char)(i + 'a')));
        }
        if (badChars.isEmpty()) return s.length();

        int result = 0;
        String[] targets = s.split(String.join("|", badChars));
        for (String tmpString: targets) {
            result = Math.max(result, longestSubstring(tmpString, k));
        }
        return result;
    }
}
