public class Solution {
    public int calculate(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int result = 0, start = 0, op = '+';
        while (start <= s.length()) {
            if (start == s.length() || (s.charAt(start) == '+' || s.charAt(start) == '-')) {
                if (op == '+') result += this.calc(stringBuilder);
                if (op == '-') result -= this.calc(stringBuilder);
                if (start != s.length()) op = s.charAt(start);
                stringBuilder = new StringBuilder();
            } else {
                if (s.charAt(start) != ' ') stringBuilder.append(s.charAt(start));
            }
            start++;
        }
        return result;
    }

    private int calc(StringBuilder sb) {
        int result = 1, op = '*', tmp = 0;
        for (int i = 0; i <= sb.length(); i++) {
            if (i == sb.length() || sb.charAt(i) == '*' || sb.charAt(i) == '/') {
                if (op == '*') result *= tmp;
                if (op == '/') result /= tmp;
                if (i != sb.length()) op = sb.charAt(i);
                tmp = 0;
            } else {
                tmp = tmp * 10 + sb.charAt(i) - 48;
            }
        }
        return result;
    }
}
