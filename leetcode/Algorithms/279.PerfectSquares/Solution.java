public class Solution {
    public int numSquares(int n) {
        int table[] = new int[n + 1];
        for (int i = 1; i < table.length; i++) {
            int j = 1, min = i;
            while (j * j <= i) {
                min = Math.min(table[i - j * j] + 1, min);
                j++;
            }
            table[i] = min;
        }
        return table[n];
    }
}
