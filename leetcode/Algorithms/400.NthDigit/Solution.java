public class Solution {
    public int findNthDigit(int n) {
        int[] boundary = new int[] {9, 180, 2700, 36000, 450000, 5400000, 63000000, 720000000, 2147483647};
        int width = 1;
        int base = 1;

        int idx = 0;
        while (idx < boundary.length && n > boundary[idx]) {
            n -= boundary[idx++];
            width++;
            base *= 10;
        }

        int skip =  (n % width == 0) ? n / width - 1 : n / width;
        int index = n - skip * width - 1;
        int thisNumber = base + skip;

        return Character.getNumericValue(String.valueOf(thisNumber).charAt(index));
    }
}
