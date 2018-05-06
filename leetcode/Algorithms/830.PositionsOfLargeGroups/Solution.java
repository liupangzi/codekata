import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        S = S + " ";
        List<List<Integer>> result = new ArrayList<>();
        int start = 0, end = 0;
        while (end < S.length()) {
            if (S.charAt(start) == S.charAt(end)) {
                end++;
            } else {
                if (end - start >= 3) result.add(Arrays.asList(start, end - 1));
                start = end;
            }
        }
        return result;
    }
}
