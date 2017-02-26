public class Solution {
    public String frequencySort(String s) {
        int table[] = new int[256];
        for (char c : s.toCharArray()) table[(int) c]++;

        String sort[] = new String[s.length() + 1];
        for (int i = 0; i < 256; i++) {
            if (table[i] > 0) {
                StringBuilder tmp = new StringBuilder();
                for (int j = 0; j < table[i]; j++) tmp.append((char) i);
                sort[table[i]] = sort[table[i]] == null ? tmp.toString() : sort[table[i]] + tmp.toString();
            }
        }

        StringBuilder result = new StringBuilder();
        for (int k = sort.length - 1; k >= 0; k--) {
            if (sort[k] != null) result.append(sort[k]);
        }
        return result.toString();
    }
}
