import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> counter = new HashMap<>();
        for (String s : A.split(" ")) counter.put(s, counter.getOrDefault(s, 0) + 1);
        for (String s : B.split(" ")) counter.put(s, counter.getOrDefault(s, 0) + 1);

        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == 1) result.add(entry.getKey());
        }
        return result.toArray(new String[0]);
    }
}
