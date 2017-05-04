import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                return p1[0] == p2[0] ? p1[1] - p2[1] : p1[0] - p2[0];
            }
        });

        int result = 1, max = points[0][1];
        for (int[] point : points) {
            if (point[0] > max) {
                max = point[1];
                result++;
            } else {
                max = Math.min(point[1], max);
            }
        }
        return result;
    }
}
