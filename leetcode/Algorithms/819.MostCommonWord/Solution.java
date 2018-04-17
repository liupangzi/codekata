import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph + ".";
        HashSet<String> ban = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> counter = new HashMap<>();

        StringBuilder tmp = new StringBuilder();
        String result = "";
        int max = 0;
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if (c >= 'a' && c <= 'z') {
                tmp.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                tmp.append((char) (c - 'A' + 'a'));
            } else {
                if (tmp.length() == 0) continue;
                String k = tmp.toString();
                int v = counter.getOrDefault(k, 0);
                if (!ban.contains(k)) {
                    counter.put(k, v + 1);
                    if (v + 1 > max) {
                        max = v + 1;
                        result = k;
                    }
                }
                tmp.setLength(0);
            }
        }
        return result;
    }
}
