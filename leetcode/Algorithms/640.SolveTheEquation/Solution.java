public class Solution {
    public String solveEquation(String equation) {
        equation = equation + "+0";
        int coefficient = 1, current = 1, x = 0, n = 0, tmp = 0;
        boolean isX = false;
        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (c == '+' || c == '-' || c == '=') {
                if (isX) {
                    x += tmp * coefficient * current;
                } else {
                    n += -1 * tmp * coefficient * current;
                }
                isX = false;
                tmp = 0;
                if (c == '=') {
                    coefficient = -1;
                    current = 1;
                } else {
                    current = c == '+' ? 1 : -1;
                }
            } else if (c == 'x') {
                isX = true;
                if (i == 0 || equation.charAt(i - 1) < '0' || equation.charAt(i - 1) > '9') tmp = 1;
            } else {
                tmp = tmp * 10 + c - 48;
            }
        }

        if (x == 0) {
            return n == 0 ? "Infinite solutions" : "No solution";
        } else {
            return "x=" + String.valueOf(n / x);
        }
    }
}
