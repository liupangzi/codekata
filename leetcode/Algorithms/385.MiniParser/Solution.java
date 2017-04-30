import java.util.Stack;

public class Solution {
    public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') return new NestedInteger(Integer.valueOf(s));

        Stack<NestedInteger> stack = new Stack<>();
        int tmp = 0, negative = 1;
        NestedInteger nestedInteger = new NestedInteger();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                stack.push(nestedInteger);
                nestedInteger = new NestedInteger();
            } else if (s.charAt(i) == ']') {
                if (s.charAt(i - 1) != ']' && s.charAt(i - 1) != '[') {
                    nestedInteger.add(new NestedInteger(tmp * negative));
                    tmp = 0;
                    negative = 1;
                }
                stack.peek().add(nestedInteger);
                nestedInteger = stack.pop();
            } else if (s.charAt(i) == ',') {
                if (s.charAt(i - 1) != ']') {
                    nestedInteger.add(new NestedInteger(tmp * negative));
                    tmp = 0;
                    negative = 1;
                }
            } else if (s.charAt(i) == '-') {
                negative = -1;
            } else {
                tmp = tmp * 10 + s.charAt(i) - 48;
            }
        }
        return nestedInteger.getList().get(0);
    }
}
