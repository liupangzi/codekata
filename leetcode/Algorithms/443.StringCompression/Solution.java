class Solution {
    public int compress(char[] chars) {
        int cursor = 0, start = 0, end = 0;
        while (end < chars.length) {
            while (end < chars.length && chars[start] == chars[end]) end++;
            int length = end - start;
            chars[cursor++] = chars[start];
            if (length > 1) {
                String L = String.valueOf(length);
                for (int i = 0; i < L.length(); i++) {
                    chars[cursor++] = L.charAt(i);
                }
            }
            start = end;
        }
        return cursor;
    }
}
