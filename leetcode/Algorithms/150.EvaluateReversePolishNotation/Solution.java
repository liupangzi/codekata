import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = Integer.valueOf(tokens[0]);
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                result += stack.pop();
            } else if (tokens[i].equals("-")) {
                result = stack.pop() - result;
            } else if (tokens[i].equals("*")) {
                result *= stack.pop();
            } else if (tokens[i].equals("/")) {
                result = stack.pop() / result;
            } else {
                stack.push(result);
                result = Integer.valueOf(tokens[i]);
            }
        }
        return result;
    }
}
