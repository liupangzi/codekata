class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int height = 1, width = 0;
        for (int i = 0; i < S.length(); i++) {
            if (width + widths[S.charAt(i) - 'a'] > 100) {
                height++;
                width = 0;
            }
            width += widths[S.charAt(i) - 'a'];
        }
        return new int[]{height, width};
    }
}
