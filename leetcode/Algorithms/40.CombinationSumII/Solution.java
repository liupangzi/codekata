import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void helper(int[] candidates, int index, int target, List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
        } else if (target > 0) {
            while (index < candidates.length) {
                list.add(candidates[index]);
                helper(candidates, index + 1, target - candidates[index], list, result);
                list.remove(list.size() - 1);
                while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) index++;
                index++;
            }
        }
    }
}
