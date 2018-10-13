class Solution {
    public String reverseOnlyLetters(String S) {
        char[] result = S.toCharArray();
        int rCursor = 0, sCursor = S.length() - 1;
        while (rCursor < result.length && sCursor >= 0) {
            if (isNotLetter(result[rCursor])) {
                rCursor++;
            } else if (isNotLetter(S.charAt(sCursor))) {
                sCursor--;
            } else {
                result[rCursor++] = S.charAt(sCursor--);
            }
        }
        return new String(result);
    }

    private boolean isNotLetter(char c) {
        return ('a' > c || c > 'z') && ('A' > c || c > 'Z');
    }
}
