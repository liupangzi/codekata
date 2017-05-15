import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> tmp = new ArrayList<>();
        helper(1, k, n, tmp);
        return result;
    }

    private void helper(int start, int k, int n, List<Integer> list) {
        if (k == 1 && n >= start && n <= 9) {
            List<Integer> tmp = new ArrayList<>(list);
            tmp.add(n);
            result.add(tmp);
        }

        if (k > 1 && start < 9) {
            List<Integer> tmp = new ArrayList<>(list);
            tmp.add(start);
            helper(start + 1, k - 1, n - start, tmp);
            helper(start + 1, k, n, list);
        }
    }
}
