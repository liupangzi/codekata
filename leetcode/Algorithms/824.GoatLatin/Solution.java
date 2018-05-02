class Solution {
    public String toGoatLatin(String S) {
        S = S + " ";
        StringBuilder result = new StringBuilder(), suffix = new StringBuilder("maa"), tmp = new StringBuilder();
        int head = 0, cursor = 1;
        while (cursor < S.length()) {
            if (S.charAt(cursor) == ' ') {
                if (isVowel(S.charAt(head))) {
                    tmp.insert(0, S.charAt(head));
                } else {
                    tmp.append(S.charAt(head));
                }
                result.append(tmp).append(suffix).append(" ");
                tmp.setLength(0);
                suffix.append('a');
                head = cursor + 1;
                cursor = head + 1;
            } else {
                tmp.append(S.charAt(cursor));
                cursor++;
            }
        }
        result.setLength(result.length() - 1);
        return result.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
}
