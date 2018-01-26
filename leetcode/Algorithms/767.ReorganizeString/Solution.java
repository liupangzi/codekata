import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String reorganizeString(String S) {
        int[][] table = new int[26][2];
        for (int i = 0; i < S.length(); i++) table[S.charAt(i) - 'a'][1]++;
        for (int i = 0; i < 26; i++) table[i][0] = i;

        Arrays.sort(table, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] == o1[1] ? o1[0] - o2[0] : o2[1] - o1[1];
            }
        });
        if (table[0][1] > (S.length() + 1) / 2) return "";

        char[] tmp = new char[S.length()];
        int cursor = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < table[i][1]; j++) {
                if (cursor >= tmp.length) cursor = 1;
                tmp[cursor] = (char) (table[i][0] + 'a');
                cursor += 2;
            }
        }
        return new String(tmp);
    }
}
