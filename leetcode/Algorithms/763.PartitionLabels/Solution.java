import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] map = new int[26];
        for (int i = 0; i < S.length(); i++) map[S.charAt(i) - 'a'] = i;

        int cursor = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (cursor < S.length()) {
            int tmp = cursor, stop = map[S.charAt(tmp) - 'a'];
            while (cursor < stop) {
                stop = Math.max(stop, map[S.charAt(cursor) - 'a']);
                cursor++;
            }
            cursor++;
            result.add(cursor - tmp);
        }
        return result;
    }
}
