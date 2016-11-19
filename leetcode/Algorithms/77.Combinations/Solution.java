import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        helper(result, tmp, n, k);
        return result;
    }

    private void helper(ArrayList<List<Integer>> result, ArrayList<Integer> arrayList, int n, int k) {
        if (k == 0 || k == n) {
            ArrayList<Integer> tmp = new ArrayList<>(arrayList);
            for (int i = 1; i <= k; i++) tmp.add(i);
            result.add(tmp);
        } else {
            for (int i = n; i >= k; i--) {
                ArrayList<Integer> tmp = new ArrayList<>(arrayList);
                tmp.add(i);
                helper(result, tmp, i - 1, k - 1);
            }
        }
    }
}
