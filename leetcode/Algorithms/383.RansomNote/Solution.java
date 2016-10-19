public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cache = new int[26];
        for (char c: magazine.toCharArray()) cache[c - 'a']++;
        for (char c: ransomNote.toCharArray()) {
            if (cache[c - 'a'] == 0) return false;
            cache[c - 'a']--;
        }
        return true;
    }
}
