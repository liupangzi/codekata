public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cache = new int[26];
        for (int i = 0; i < s.length(); i++) cache[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) cache[t.charAt(i) - 'a']--;
        for (int i : cache) if (i != 0) return false;
        return true;
    }
}
