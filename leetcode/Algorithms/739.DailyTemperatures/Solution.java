import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[] = new int[temperatures.length], cursor = 0;
        Stack<Integer> stack = new Stack<>();
        while (cursor < temperatures.length) {
            if (stack.empty() || temperatures[stack.peek()] >= temperatures[cursor]) {
                stack.add(cursor++);
            } else {
                int tmp = stack.pop();
                result[tmp] = cursor - tmp;
            }
        }
        return result;
    }
}
