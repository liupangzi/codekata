public class Solution {
    public String reverseStr(String s, int k) {
        char[] tmp = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int start = i, end = Math.min(i + k - 1, s.length() - 1);
            while (start < end) {
                char c = tmp[start];
                tmp[start++] = tmp[end];
                tmp[end--] = c;
            }
        }
        return new String(tmp);
    }
}
