public class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> strings = new Stack<>();
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                counts.push(Integer.valueOf(s.substring(i, s.indexOf('[', i))));
                i = s.indexOf('[', i);
            } else if (s.charAt(i) == '[') {
                strings.push(result.toString());
                result = new StringBuilder();
                i++;
            } else if (s.charAt(i) == ']') {
                int count = counts.pop();
                StringBuilder str = new StringBuilder(strings.pop());
                while (count-- > 0) {
                    str.append(result);
                }
                result = str;
                i++;
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
