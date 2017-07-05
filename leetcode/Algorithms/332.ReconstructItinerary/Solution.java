import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    private HashMap<String, PriorityQueue<String>> map = new HashMap<>();

    public List<String> findItinerary(String[][] tickets) {
        for (String[] ticket : tickets) {
            map.putIfAbsent(ticket[0], new PriorityQueue<>());
            map.get(ticket[0]).add(ticket[1]);
        }
        ArrayList<String> result = new ArrayList<>();
        helper("JFK", result);
        return result;
    }

    private void helper(String key, List<String> result) {
        while (map.get(key) != null && !map.get(key).isEmpty()) {
            helper(map.get(key).poll(), result);
        }
        result.add(0, key);
    }
}
