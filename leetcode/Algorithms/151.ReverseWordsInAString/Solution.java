public class Solution {
    public String reverseWords(String s) {
        if (s == null) return null;

        int start = s.length() - 1;
        StringBuilder result = new StringBuilder();
        while (start >= 0) {
            if (s.charAt(start) == ' ') continue;
            int tmpStart = start;
            while (tmpStart >= 0 && s.charAt(tmpStart) != ' ') tmpStart--;
            result.append(s.substring(tmpStart + 1, start + 1)).append(" ");
            start = tmpStart;
        }

        if (result.length() > 0) result.setLength(result.length() - 1);
        return result.toString();
    }
}
