import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < J.length(); i++) map.put(J.charAt(i), 0);

        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) result++;
        }
        return result;
    }
}
