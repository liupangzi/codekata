import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> table = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String k = new String(chars);
            List<String> v = table.getOrDefault(k, new ArrayList<>());
            v.add(s);
            table.put(k, v);
        }
        return new ArrayList<>(table.values());
    }
}
