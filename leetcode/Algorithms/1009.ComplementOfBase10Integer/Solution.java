class Solution {
    public int bitwiseComplement(int N) {
        int k = 1;
        while (k < N) k = (k << 1) + 1;
        return N ^ k;
    }
}