public class Solution {
    public int nthUglyNumber(int n) {
        int i = 0, j = 0, k = 0, table[] = new int[1691], index = 0;
        table[index] = 1;
        while (++index < n) {
            table[index] = Math.min(table[i] * 2, Math.min(table[j] * 3, table[k] * 5));
            if (table[i] * 2 == table[index]) i++;
            if (table[j] * 3 == table[index]) j++;
            if (table[k] * 5 == table[index]) k++;
        }
        return table[n - 1];
    }
}
