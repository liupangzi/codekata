import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    HashMap<String, List<Integer>> map = new HashMap<>();

    public List<Integer> diffWaysToCompute(String input) {
        int cursor = 0;
        List<Integer> list = new ArrayList<>();
        while (cursor < input.length()) {
            char c = input.charAt(cursor);
            if (c < 48) {
                String left = input.substring(0, cursor), right = input.substring(cursor + 1);
                if (!map.containsKey(left)) map.put(left, diffWaysToCompute(left));
                if (!map.containsKey(right)) map.put(right, diffWaysToCompute(right));
                for (int l : map.get(left)) {
                    for (int r : map.get(right)) {
                        if (c == '*') {
                            list.add(l * r);
                        } else if (c == '+') {
                            list.add(l + r);
                        } else if (c == '-') {
                            list.add(l - r);
                        }
                    }
                }
            }
            cursor++;
        }
        if (list.size() == 0) list.add(Integer.valueOf(input));
        return list;
    }
}
