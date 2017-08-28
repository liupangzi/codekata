import java.util.List;

public class Solution {
    public List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        int start = 0;
        for (int i = 1; i + k - 1 < arr.size(); i++) {
            int pre = Math.abs(x - arr.get(i - 1)), next = Math.abs(x - arr.get(i + k - 1));
            if (pre > next) {
                start = i;
            } else if (pre < next) {
                break;
            }
        }
        return arr.subList(start, start + k);
    }
}
