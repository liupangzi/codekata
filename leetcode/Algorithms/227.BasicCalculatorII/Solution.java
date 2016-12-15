import java.util.Stack;

public class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int start = 0, op = '+', tmp = 0;
        while (start <= s.length()) {
            if (start == s.length() || s.charAt(start) == '+' || s.charAt(start) == '-' || s.charAt(start) == '*' || s.charAt(start) == '/') {
                if (op == '+') stack.push(tmp);
                if (op == '-') stack.push(-tmp);
                if (op == '*') stack.push(stack.pop() * tmp);
                if (op == '/') stack.push(stack.pop() / tmp);
                tmp = 0;
                if (start != s.length()) op = s.charAt(start);
            } else {
                if (s.charAt(start) != ' ') tmp = tmp * 10 + s.charAt(start) - '0';
            }
            start++;
        }

        int result = 0;
        for (int i : stack) result += i;
        return result;
    }
}
