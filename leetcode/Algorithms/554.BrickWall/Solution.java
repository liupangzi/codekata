import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (List<Integer> line : wall) {
            int tmp = 0;
            for (int j = 0; j < line.size() - 1; j++) {
                tmp += line.get(j);
                map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            }
        }

        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) max = Math.max(max, entry.getValue());
        return wall.size() - max;
    }
}
