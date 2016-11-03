public class Solution {
    private static boolean[] table = new boolean[128];

    static {
        for (int i = 48; i <= 57; i++) table[i] = true;  // 0-9
        for (int j = 65; j <= 90; j++) table[j] = true;  // A-Z
        for (int k = 97; k <= 122; k++) table[k] = true; // a-z
    }

    public boolean isPalindrome(String s) {
        if (s == null) return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!table[s.charAt(i)]) {i++; continue;}
            if (!table[s.charAt(j)]) {j--; continue;}
            if (Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) return false;
        }
        return true;
    }
}
