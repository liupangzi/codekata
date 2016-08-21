public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> cache = new LinkedHashMap<>();
        HashMap<Character, Integer> location = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (cache.get(s.charAt(i)) != null) {
                cache.put(s.charAt(i), cache.get(s.charAt(i)) + 1);
            } else {
                cache.put(s.charAt(i), 1);
                location.put(s.charAt(i), i);
            }
        }

        for(Map.Entry<Character, Integer> entry : cache.entrySet()){
            if (entry.getValue().equals(1)) {
                return location.get(entry.getKey());
            }
        }

        return -1;
    }
}
