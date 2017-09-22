import java.util.HashMap;
import java.util.Map;

class MagicDictionary {
    private HashMap<String, Integer> map = new HashMap<>();

    public MagicDictionary() {
        map.clear();
    }

    public void buildDict(String[] dict) {
        for (String word : dict) {
            for (int i = 0; i < word.length(); i++) {
                map.put(word, i);
            }
        }
    }

    public boolean search(String word) {
        outer:
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String k = entry.getKey();
            if (k.length() != word.length()) continue;

            int count = 0, index = 0;
            for (int i = 0; i < k.length(); i++) {
                if (k.charAt(i) != word.charAt(i)) {
                    count++;
                    index = i;
                }
                if (count > 1) continue outer;
            }
            if (count == 1 && word.charAt(index) != k.charAt(index)) return true;
        }
        return false;
    }
}
