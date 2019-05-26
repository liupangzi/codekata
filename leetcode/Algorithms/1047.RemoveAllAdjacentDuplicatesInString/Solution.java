class Solution {
    public String removeDuplicates(String S) {
        char[] tmp = S.toCharArray();
        int cursor = 0, end = 0;
        while (end < S.length()) {
            if (cursor == 0 || tmp[cursor - 1] != tmp[end]) {
                tmp[cursor++] = tmp[end++];
            } else {
                cursor--;
                end++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cursor; i++) {
            result.append(tmp[i]);
        }
        return result.toString();
    }
}