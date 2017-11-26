import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                boolean isDestroyed = false;
                while (!stack.isEmpty() && stack.peek() > 0) {
                    if (stack.peek() > Math.abs(asteroid)) {
                        isDestroyed = true;
                        break;
                    } else if (stack.peek() < Math.abs(asteroid)) {
                        stack.pop();
                    } else {
                        isDestroyed = true;
                        stack.pop();
                        break;
                    }
                }
                if (!isDestroyed) stack.add(asteroid);
            } else {
                stack.add(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) result[i] = stack.get(i);
        return result;
    }
}
