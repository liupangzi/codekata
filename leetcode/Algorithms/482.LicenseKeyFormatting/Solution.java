public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder result = new StringBuilder();
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (c != '-') {
                if (c >= 'a' && c <= 'z') {
                    result.append((char) (c - 32));
                } else {
                    result.append(c);
                }
                if (result.length() % (K + 1) == K) result.append('-');
            }
        }
        return result.length() > 0 && result.charAt(result.length() - 1) == '-'
                ? result.reverse().substring(1)
                : result.reverse().toString();
    }
}
