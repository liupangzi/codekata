class Solution {
    public int countPrimeSetBits(int L, int R) {
        boolean[] table = new boolean[32];
        table[2] = true;
        table[3] = true;
        table[5] = true;
        table[7] = true;
        table[11] = true;
        table[13] = true;
        table[17] = true;
        table[19] = true;
        table[23] = true;
        table[29] = true;
        table[31] = true;

        int result = 0;
        for (int i = L; i <= R; i++) {
            if (table[Integer.bitCount(i)]) result++;
        }
        return result;
    }
}
