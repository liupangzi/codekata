import java.util.Stack;

class Solution {
    public int longestWPI(int[] hours) {
        int[] sum = new int[hours.length + 1];
        for (int i = 0; i < hours.length; i++) {
            sum[i + 1] = hours[i] > 8 ? sum[i] + 1 : sum[i] - 1;
        }

        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < sum.length; i++) {
            if (stack.empty() || sum[i] < stack.peek()[1]) {
                int[] x = new int[]{i, sum[i]};
                stack.add(x);
            }
        }

        int result = 0;
        for (int j = sum.length - 1; j >= 0; j--) {
            while (!stack.empty() && sum[j] > stack.peek()[1] + 1) {
                stack.pop();
            }

            if (stack.empty()) {
                return Math.max(result, j);
            }

            if (sum[j] > stack.peek()[1]) {
                result = Math.max(result, j - stack.peek()[0]);
            }
        }
        return result;
    }
}
