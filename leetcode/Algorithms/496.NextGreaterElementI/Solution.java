import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num) hashMap.put(stack.pop(), num);
            stack.add(num);
        }

        int[] result = new int[findNums.length];
        for (int k = 0; k < findNums.length; k++) {
            result[k] = hashMap.getOrDefault(findNums[k], -1);
        }
        return result;
    }
}
