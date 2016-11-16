public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int start = 0, len = str.length();
        while ((start = str.indexOf(str.charAt(0), start + 1)) != -1 && start <= len / 2) {
            if (len % start == 0 && str.startsWith(str.substring(start))) return true;
        }
        return false;
    }
}
