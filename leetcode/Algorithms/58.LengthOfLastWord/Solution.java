public class Solution {
    public int lengthOfLastWord(String s) {
        String t = s.trim();
        return t.lastIndexOf(' ') == -1 ? t.length() : t.length() - t.lastIndexOf(' ') - 1;
    }
}
