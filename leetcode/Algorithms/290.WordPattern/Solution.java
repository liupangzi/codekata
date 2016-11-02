public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if (arr.length != pattern.length()) return false;

        HashMap<Character, String> p2s = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (p2s.containsKey(pattern.charAt(i))) {
                if (!p2s.get(pattern.charAt(i)).equals(arr[i])) return false;
            } else {
                if (p2s.containsValue(arr[i])) return false;
                p2s.put(pattern.charAt(i), arr[i]);
            }
        }
        return true;
    }
}
