public class Solution {
    public String convert(String s, int nRows) {
        if (nRows == 1 || s.length() <= nRows) return s;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += nRows * 2 - 2) {
            result.append(s.charAt(i));
        }

        for (int i = 1; i < nRows - 1; i++) {
            int odd = i;
            int even = nRows * 2 - 2 - i;
            while (odd < s.length() || even < s.length()) {
                result.append(s.charAt(odd));
                if (even < s.length()) {
                    result.append(s.charAt(even));
                }
                odd += nRows * 2 - 2;
                even += nRows * 2 - 2;
            }
        }

        for (int i = nRows - 1; i < s.length(); i += nRows * 2 - 2) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
