import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<List<Integer>>> table = new ArrayList<>();
        for (int i = 0; i <= target; i++) table.add(new ArrayList<>());
        table.get(0).add(new ArrayList<>());

        for (int candidate : candidates) {
            for (int i = 0; i <= target - candidate; i++) {
                for (List<Integer> origin : table.get(i)) {
                    ArrayList<Integer> tmp = new ArrayList<>(origin);
                    tmp.add(candidate);
                    table.get(i + candidate).add(tmp);
                }
            }
        }
        return table.get(target);
    }
}
