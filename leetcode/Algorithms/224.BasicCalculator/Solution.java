import java.util.Stack;

public class Solution {
    public int calculate(String s) {
        Stack<int[]> stack = new Stack<>();
        int result = 0, tmp = 0, plus = 1;

        for (char c : s.toCharArray()) {
            if (c == '+' || c == '-') {
                result += plus == 1 ? tmp : -tmp;
                tmp = 0;
                plus = c == '+' ? 1 : -1;
            } else if (c <= '9' && c >= '0') {
                tmp = tmp * 10 + (c - 48);
            } else if (c == '(') {
                stack.add(new int[]{result, plus});
                result = 0;
                plus = 1;
            } else if (c == ')') {
                result += plus == 1 ? tmp : -tmp;
                int[] array = stack.pop();
                tmp = 0;
                plus = array[1];
                result = plus == 1 ? array[0] + result : array[0] - result;
            }
        }

        return plus == 1 ? result + tmp : result - tmp;
    }
}
