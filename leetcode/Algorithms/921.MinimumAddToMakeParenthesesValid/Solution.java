class Solution {
    public int minAddToMakeValid(String S) {
        char[] tmp = S.toCharArray();
        int start = -1, end = 0;
        while (end < tmp.length) {
            if (start == -1 || !(tmp[start] == '(' && tmp[end] == ')')) {
                tmp[++start] = tmp[end++];
            } else {
                start--;
                end++;
            }
        }
        return start + 1;
    }
}
