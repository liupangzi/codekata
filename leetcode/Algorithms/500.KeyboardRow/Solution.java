import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public String[] findWords(String[] words) {
        String[] kb = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            for (char c : kb[i].toCharArray()) {
                table.put((int) c, i);
                table.put(c - 32, i);
            }
        }

        ArrayList<String> result = new ArrayList<>();
        outer:
        for (String word : words) {
            for (int k = 0; k < word.length() - 1; k++) {
                if (!table.get((int) word.charAt(k)).equals(table.get((int) word.charAt(k + 1)))) continue outer;
            }
            result.add(word);
        }

        return result.toArray(new String[0]);
    }
}
