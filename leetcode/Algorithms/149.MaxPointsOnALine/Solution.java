/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */

public class Solution {
    public int maxPoints(Point[] points) {
        if (points.length <= 1) return points.length;

        int result = 0;
        for (int i = 0; i < points.length; i++) {
            Point I = points[i];
            for (int j = 0; j < points.length; j++) {
                if (j == i) continue;
                Point J = points[j];
                int max = 0;
                for (int k = j + 1; k < points.length; k++) {
                    if (k == i) continue;
                    Point K = points[k];
                    if (J.x == I.x) {
                        if (I.x == K.x) max++;
                    } else {
                        if ((K.y - I.y) * (J.x - I.x) == (J.y - I.y) * (K.x - I.x)) max++;
                    }
                }
                if (max > result) result = max;
            }
        }
        return result + 2;
    }
}
