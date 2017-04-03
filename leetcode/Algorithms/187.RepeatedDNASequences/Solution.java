import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 11) return result;

        HashMap<Integer, Integer> map = new HashMap<>();
        int table[] = new int[20], mask = 0b11111111111111111111, n = 0;
        table['C' - 'A'] = 1;
        table['G' - 'A'] = 2;
        table['T' - 'A'] = 3;
        for (int i = 0; i < 10; i++) {
            n <<= 2;
            n += table[s.charAt(i) - 'A'];
        }
        map.put(n, 1);

        for (int i = 1; i < s.length() - 9; i++) {
            n <<= 2;
            n += table[s.charAt(i + 9) - 'A'];
            n &= mask;
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) == 2) result.add(s.substring(i, i + 10));
        }
        return result;
    }
}
