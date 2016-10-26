public class Solution {
    private static int[] table;

    static {
        table = new int[26];
        table[8] = 1;      // I
        table[21] = 5;     // V
        table[23] = 10;    // X
        table[11] = 50;    // L
        table[2] = 100;    // C
        table[3] = 500;    // D
        table[12] = 1000;  // M
    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (table[s.charAt(i) - 'A'] < table[s.charAt(i + 1) - 'A']) {
                result -= table[s.charAt(i) - 'A'];
            } else {
                result += table[s.charAt(i) - 'A'];
            }
        }
        return result + table[s.charAt(s.length() - 1) - 'A'];
    }
}
