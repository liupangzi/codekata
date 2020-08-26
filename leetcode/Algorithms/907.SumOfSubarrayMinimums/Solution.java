import java.util.Stack;

class Solution {
    public int sumSubarrayMins(int[] A) {
        Stack<int[]> stack = new Stack<>();
        stack.add(new int[]{-1, 0, 0}); // idx, value, deltaSum
        int result = 0, tmp = 0;
        for (int i = 0; i < A.length; i++) {
            while (stack.peek()[1] > A[i]) {
                tmp -= stack.pop()[2];
            }

            int delta = (i - stack.peek()[0]) * A[i];
            tmp += delta;
            stack.add(new int[]{i, A[i], delta});

            result += tmp;
            result %= 1000000007;
        }
        return result;
    }
}
