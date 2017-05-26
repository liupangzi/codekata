import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        ArrayList<Integer> indices = new ArrayList<>();
        List<List<List<Integer>>> values = new ArrayList<>();

        for (int num : nums) {
            int index = Collections.binarySearch(indices, num);
            List<Integer> solo = new ArrayList<>();
            solo.add(num);

            if (index < 0) {
                index = -(index + 1);
                List<List<Integer>> next = new ArrayList<>();
                next.add(solo);
                values.add(index, next);
                indices.add(index, num);
            } else {
                for (List<Integer> list : values.get(index)) {
                    list.add(num);
                }
                values.get(index).add(solo);
            }

            for (int i = index - 1; i >= 0; i--) {
                for (List<Integer> list : values.get(i)) {
                    List<Integer> next = new ArrayList<>(list);
                    next.add(num);
                    values.get(index).add(next);
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (List<List<Integer>> list : values) {
            for (List<Integer> tmp : list) {
                if (tmp.size() > 1) result.add(tmp);
            }
        }
        return result;
    }
}
