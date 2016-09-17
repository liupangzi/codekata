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
                str.append(this.repeatString(result.toString(), count));
                result = str;
                i++;
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
    
    private String repeatString(String s, int n) {
        StringBuilder result = new StringBuilder();
        StringBuilder factor = new StringBuilder(s);

        while (n != 0) {
            if ((n & 1) == 1) result.append(factor);
            factor.append(factor);
            n >>>= 1;
        }

        return result.toString();
    }
}
