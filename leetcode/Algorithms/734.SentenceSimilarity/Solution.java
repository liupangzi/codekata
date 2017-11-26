import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) return false;
        HashMap<String, HashSet<String>> cache = new HashMap<>();
        for (String[] pair : pairs) {
            cache.putIfAbsent(pair[0], new HashSet<>());
            cache.putIfAbsent(pair[1], new HashSet<>());
            cache.get(pair[0]).add(pair[1]);
            cache.get(pair[1]).add(pair[0]);
        }

        for (int i = 0; i < words1.length; i++) {
            if (!words1[i].equals(words2[i]) && (cache.get(words1[i]) == null || !cache.get(words1[i]).contains(words2[i]))) {
                return false;
            }
        }
        return true;
    }
}
