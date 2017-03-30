import java.util.Stack;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int len = nums.length, result[] = new int[len];

        for (int i = 0; i < len; i++) {
            while (!stack.empty() && nums[stack.peek()] < nums[i]) {
                result[stack.pop()] = nums[i];
            }
            stack.add(i);
        }

        for (int num : nums) {
            while (!stack.empty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }
        }

        while (!stack.empty()) result[stack.pop()] = -1;

        return result;
    }
}
