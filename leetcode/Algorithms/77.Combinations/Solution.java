import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if (k == n || k == 0) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = 1; i <= k; i++) tmp.add(i);
            List<List<Integer>> result = new ArrayList<>();
            result.add(tmp);
            return result;
        }

        List<List<Integer>> result = combine(n - 1, k - 1);
        result.forEach(e -> e.add(n));
        result.addAll(combine(n - 1, k));
        return result;
    }
}
