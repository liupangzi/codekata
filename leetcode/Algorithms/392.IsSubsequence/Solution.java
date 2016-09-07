public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int lastIndex = 0;

        while (i < s.length() && t.indexOf(s.charAt(i), lastIndex) > -1) {
            lastIndex = t.indexOf(s.charAt(i), lastIndex) + 1;
            i++;
        }

        return i == s.length();
    }
}
