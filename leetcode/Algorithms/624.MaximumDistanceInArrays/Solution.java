import java.util.List;

public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0), max = arrays.get(0).get(arrays.get(0).size() - 1), result = 0;
        for (int i = 1; i < arrays.size(); i++) {
            int tmpMin = arrays.get(i).get(0), tmpMax = arrays.get(i).get(arrays.get(i).size() - 1);
            result = Math.max(result, Math.max(Math.abs(tmpMax - min), Math.abs(tmpMin - max)));
            min = Math.min(min, tmpMin);
            max = Math.max(max, tmpMax);
        }
        return result;
    }
}
