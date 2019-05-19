class Solution {
    public int[] diStringMatch(String S) {
        int i = 0, j = S.length();
        int[] result = new int[S.length() + 1];
        for (int k = 0; k < S.length(); k++) {
            if (S.charAt(k) == 'I') {
                result[k] = i++;
            } else {
                result[k] = j--;
            }
        }
        result[S.length()] = i;
        return result;
    }
}