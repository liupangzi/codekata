class Solution {
    public int repeatedStringMatch(String A, String B) {
        int count = (B.length() + A.length() - 1) / A.length();
        String tmp = mString(A, count);
        if (tmp.contains(B)) return count;
        return (tmp + A).contains(B) ? count + 1 : -1;
    }

    private String mString(String s, int n) {
        StringBuilder result = new StringBuilder(), tmp = new StringBuilder(s);
        while (n > 0) {
            if ((n & 1) == 1) result.append(tmp);
            tmp.append(tmp);
            n >>= 1;
        }
        return result.toString();
    }
}
