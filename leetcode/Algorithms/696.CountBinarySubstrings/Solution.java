class Solution {
    public int countBinarySubstrings(String s) {
        int result = 0, last = 0, cursor = 0;
        while (cursor < s.length()) {
            int next = cursor;
            while (next < s.length() && s.charAt(next) == s.charAt(cursor)) next++;
            result += Math.min(last, next - cursor);
            last = next - cursor;
            cursor = next;
        }
        return result;
    }
}
