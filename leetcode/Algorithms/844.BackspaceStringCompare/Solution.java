class Solution {
    public boolean backspaceCompare(String S, String T) {
        int sIndex = S.length() - 1, tIndex = T.length() - 1;
        while (sIndex >= 0 || tIndex >= 0) {
            int sCount = 0, tCount = 0;
            while (sIndex >= 0 && (S.charAt(sIndex) == '#' || sCount > 0)) {
                sCount += S.charAt(sIndex) == '#' ? 1 : -1;
                sIndex--;
            }

            while (tIndex >= 0 && (T.charAt(tIndex) == '#' || tCount > 0)) {
                tCount += T.charAt(tIndex) == '#' ? 1 : -1;
                tIndex--;
            }

            if (sIndex >= 0 && tIndex >= 0 && S.charAt(sIndex) == T.charAt(tIndex)) {
                sIndex--;
                tIndex--;
            } else {
                break;
            }
        }
        return sIndex == -1 && tIndex == -1;
    }
}
