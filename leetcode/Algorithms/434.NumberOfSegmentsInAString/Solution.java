public class Solution {
    public int countSegments(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) != ' ') && (i == s.length() - 1 || s.charAt(i + 1) == ' ')) result++;
            // OR......
            // if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) result++;
        }
        return result;
    }
}
