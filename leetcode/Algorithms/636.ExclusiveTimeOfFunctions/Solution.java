import java.util.List;
import java.util.Stack;

public class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<int[]> stack = new Stack<>();
        Stack<Integer> interval = new Stack<>();
        int result[] = new int[n];
        for (String log : logs) {
            String[] tmp = log.split(":");
            if (tmp[1].equals("start")) {
                stack.add(new int[]{Integer.valueOf(tmp[0]), Integer.valueOf(tmp[2])});
                interval.add(0);
            } else {
                int[] last = stack.pop();
                result[last[0]] += Integer.valueOf(tmp[2]) - last[1] - interval.pop() + 1;
                if (!interval.empty()) {
                    interval.add(interval.pop() + Integer.valueOf(tmp[2]) - last[1] + 1);
                }
            }
        }
        return result;
    }
}
