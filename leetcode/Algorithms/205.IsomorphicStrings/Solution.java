public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int s2t[] = new int[256], t2s[] = new int[256], len = s.length();
        for (int i = 0; i < len; i++) {
            if (s2t[s.charAt(i)] == 0 && t2s[t.charAt(i)] == 0) {
                s2t[s.charAt(i)] = t.charAt(i);
                t2s[t.charAt(i)] = s.charAt(i);
            } else if (s2t[s.charAt(i)] != t.charAt(i) || s.charAt(i) != t2s[t.charAt(i)]) {
                return false;
            }
        }
        return true;
    }
}
