import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (nums.length == 0) return result;

        ArrayList<Integer> init = new ArrayList<>();
        init.add(nums[0]);
        result.add(init);
        int count = 1, delta = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < count; j++) {
                for (int k = 0; k <= result.getFirst().size(); k++) {
                    ArrayList<Integer> tmp = new ArrayList<>(result.getFirst());
                    tmp.add(k, nums[i]);
                    result.add(tmp);
                }
                result.removeFirst();
            }
            count *= (++delta);
        }
        return result;
    }
}
