class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int count = 0;
        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i] == 1) {
                count++;
            } else {
                break;
            }
        }
        return (count & 1) == 0;
    }
}
