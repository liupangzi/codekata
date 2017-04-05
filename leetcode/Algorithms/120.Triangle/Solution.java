import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int count = triangle.size(), result[] = new int[count + 1];
        for (int i = count - 1; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                result[j] = triangle.get(i).get(j) + Math.min(result[j], result[j + 1]);
            }
        }
        return result[0];
    }
}
