import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private static HashMap<Character, String[]> map = new HashMap<>();

    static {
        map.put('0', new String[0]);
        map.put('1', new String[0]);
        map.put('2', new String[]{"a", "b", "c"});
        map.put('3', new String[]{"d", "e", "f"});
        map.put('4', new String[]{"g", "h", "i"});
        map.put('5', new String[]{"j", "k", "l"});
        map.put('6', new String[]{"m", "n", "o"});
        map.put('7', new String[]{"p", "q", "r", "s"});
        map.put('8', new String[]{"t", "u", "v"});
        map.put('9', new String[]{"w", "x", "y", "z"});
    }

    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits.length() == 0) return result;

        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int count = result.size();
            for (int j = 0; j < count; j++) {
                String last = result.pollLast();
                for (String value : map.get(digits.charAt(i))) result.push(last + value);
            }
        }

        return result;
    }
}
