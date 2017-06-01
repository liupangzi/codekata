import java.util.Stack;

public class Solution {
    public boolean find132pattern(int[] nums) {
        int min = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.empty()) {
                stack.push(nums[i]);
            } else if (stack.peek() >= nums[i]) {
                if (nums[i] < min) return true;
                stack.push(nums[i]);
            } else if (stack.peek() < nums[i]) {
                int nextMin = 0;
                while (!stack.empty() && stack.peek() < nums[i]) nextMin = stack.pop();
                min = Math.max(min, nextMin);
                stack.push(nums[i]);
            }
        }
        return false;
    }
}
