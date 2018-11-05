class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        int same[] = new int[26], diff[] = new int[2], cursor = 0;
        boolean hasPair = false;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(i)) {
                if (hasPair) continue;
                same[A.charAt(i) - 'a']++;
                if (same[A.charAt(i) - 'a'] >= 2) hasPair = true;
            } else {
                if (cursor == 2) return false;
                diff[cursor++] = i;
            }
        }
        return cursor > 0 ? A.charAt(diff[0]) == B.charAt(diff[1]) && A.charAt(diff[1]) == B.charAt(diff[0]) : hasPair;
    }
}
