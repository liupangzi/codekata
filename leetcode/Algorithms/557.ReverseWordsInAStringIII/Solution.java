public class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder(), tmp = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == ' ') {
                result.append(tmp.reverse()).append(' ');
                tmp.setLength(0);
            } else {
                tmp.append(s.charAt(index));
            }
            index++;
        }
        return result.append(tmp.reverse()).toString();
    }
}
