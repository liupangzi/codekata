class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean last = (n & 1) == 1;
        n >>= 1;
        while (n != 0) {
            boolean next = ((n & 1) == 1);
            if (next == last) return false;
            last = next;
            n >>= 1;
        }
        return true;
    }
}
