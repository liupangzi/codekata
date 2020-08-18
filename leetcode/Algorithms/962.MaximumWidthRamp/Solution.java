import java.util.Stack;

class Solution {
    public int maxWidthRamp(int[] A) {
        Stack<int[]> s = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (s.empty() || s.peek()[1] > A[i]) {
                s.push(new int[]{i, A[i]});
            }
        }

        int result = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (s.empty()) break;
            while (!s.empty() && s.peek()[1] <= A[i]) {
                result = Math.max(result, i - s.peek()[0]);
                s.pop();
            }
        }
        return result;
    }
}
