import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                return p1[1] - p2[1];
            }
        });

        int result = 1, cursor = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > cursor) {
                cursor = pairs[i][1];
                result++;
            }
        }
        return result;
    }
}
