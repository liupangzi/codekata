import java.util.HashMap;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (licensePlate.charAt(i) >= 97 && licensePlate.charAt(i) <= 122) {
                cache.put(licensePlate.charAt(i) - 'a', cache.getOrDefault(licensePlate.charAt(i) - 'a', 0) + 1);
            } else if (licensePlate.charAt(i) >= 65 && licensePlate.charAt(i) <= 90) {
                cache.put(licensePlate.charAt(i) - 'A', cache.getOrDefault(licensePlate.charAt(i) - 'A', 0) + 1);
            }
        }

        String result = null;
        for (String word : words) {
            HashMap<Integer, Integer> tmp = new HashMap<>(cache);
            for (int i = 0; i < word.length(); i++) {
                int k = word.charAt(i) - 'a';
                if (!tmp.containsKey(k)) continue;
                if (tmp.get(k) == 1) {
                    tmp.remove(k);
                } else {
                    tmp.put(k, tmp.get(k) - 1);
                }
            }
            if (tmp.size() == 0 && (result == null || result.length() > word.length())) result = word;
        }
        return result;
    }
}
