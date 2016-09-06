public class Solution {
    public char findTheDifference(String s, String t) {
        int cache[] = new int[26];

        for (char sc: s.toCharArray()) {
            cache[sc - 'a']++;
        }

        for (char tc: t.toCharArray()) {
            if (cache[tc - 'a'] > 0) {
                cache[tc - 'a']--;
            } else {
                return tc;
            }
        }

        return t.charAt(t.length() - 1);
    }
}
