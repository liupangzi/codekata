import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new LinkedList<>();
        int cursor = A.length - 1;
        while (cursor >= 0 || K != 0) {
            int n = cursor >= 0 ? A[cursor--] + K : K;
            result.add(0, n % 10);
            K = n / 10;
        }
        return result;
    }
}