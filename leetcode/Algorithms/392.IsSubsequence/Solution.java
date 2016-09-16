public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, lastIndex = 0;

        while (i < s.length() && (lastIndex = t.indexOf(s.charAt(i), lastIndex)) > -1) {
            lastIndex++;
            i++;
        }

        return i == s.length();
    }
}
