class Solution {
    public String removeOuterParentheses(String S) {
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                if (counter != 0) stringBuilder.append(S.charAt(i));
                counter++;
            } else {
                if (counter != 1) stringBuilder.append(S.charAt(i));
                counter--;
            }
        }
        return stringBuilder.toString();
    }
}