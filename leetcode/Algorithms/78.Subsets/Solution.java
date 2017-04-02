import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            int n = result.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> tmp = new ArrayList<>(result.get(i));
                tmp.add(num);
                result.add(tmp);
            }
        }

        return result;
    }
}
