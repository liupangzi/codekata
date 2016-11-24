public class Solution {
    public String originalDigits(String s) {
        int[] tmp = new int[26], cache = new int[10];
        for (int i = 0; i < s.length(); i++) tmp[s.charAt(i) - 'a']++;

        // 0
        cache[0] = tmp['z' - 'a'];
        tmp['e' - 'a'] -= cache[0];
        tmp['r' - 'a'] -= cache[0];
        tmp['o' - 'a'] -= cache[0];

        // 2
        cache[2] = tmp['w' - 'a'];
        tmp['t' - 'a'] -= cache[2];
        tmp['o' - 'a'] -= cache[2];

        // 4
        cache[4] = tmp['u' - 'a'];
        tmp['f' - 'a'] -= cache[4];
        tmp['o' - 'a'] -= cache[4];
        tmp['r' - 'a'] -= cache[4];

        // 6
        cache[6] = tmp['x' - 'a'];
        tmp['s' - 'a'] -= cache[6];
        tmp['i' - 'a'] -= cache[6];

        // 8
        cache[8] = tmp['g' - 'a'];
        tmp['e' - 'a'] -= cache[8];
        tmp['i' - 'a'] -= cache[8];
        tmp['h' - 'a'] -= cache[8];
        tmp['t' - 'a'] -= cache[8];

        // 1
        cache[1] = tmp['o' - 'a'];
        tmp['n' - 'a'] -= cache[1];
        tmp['e' - 'a'] -= cache[1];

        // 3
        cache[3] = tmp['t' - 'a'];
        tmp['h' - 'a'] -= cache[3];
        tmp['r' - 'a'] -= cache[3];
        tmp['e' - 'a'] -= cache[3] * 2;

        // 5
        cache[5] = tmp['f' - 'a'];
        tmp['i' - 'a'] -= cache[5];
        tmp['v' - 'a'] -= cache[5];
        tmp['e' - 'a'] -= cache[5];

        // 7
        cache[7] = tmp['s' - 'a'];
        tmp['n' - 'a'] -= cache[7];
        tmp['v' - 'a'] -= cache[7];
        tmp['e' - 'a'] -= cache[7] * 2;

        // 9
        cache[9] = tmp['i' - 'a'];

        StringBuilder result = new StringBuilder();
        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < cache[m]; n++) {
                result.append(m);
            }
        }
        return result.toString();
    }
}
