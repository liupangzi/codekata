import java.util.Arrays;
import java.util.Stack;

class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        int cursor = 0;

        String result = "";
        Stack<String> stack = new Stack<>();
        stack.add(result);
        while (cursor < words.length) {
            if (stack.peek().length() >= words[cursor].length()) {
                stack.pop();
            } else {
                if (stack.peek().length() + 1 == words[cursor].length() && words[cursor].indexOf(stack.peek()) == 0) {
                    if (words[cursor].length() > result.length()) result = words[cursor];
                    stack.add(words[cursor]);
                }
                cursor++;
            }
        }
        return result;
    }
}
