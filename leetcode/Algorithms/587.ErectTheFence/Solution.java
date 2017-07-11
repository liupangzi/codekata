import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Point> outerTrees(Point[] points) {
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.x == p2.x ? p1.y - p2.y : p1.x - p2.x;
            }
        });

        Stack<Point> result = new Stack<>();

        for (Point point : points) {
            while (result.size() > 1 && isValid(result.get(result.size() - 2), result.peek(), point)) {
                result.pop();
            }
            result.add(point);
        }
        if (result.size() == points.length) return result;

        for (int i = points.length - 2; i > 0; i--) {
            while (result.size() > 1 && isValid(result.get(result.size() - 2), result.peek(), points[i])) {
                result.pop();
            }
            result.add(points[i]);
        }

        while (isValid(result.get(result.size() - 2), result.peek(), result.get(0))) {
            result.remove(result.size() - 1);
        }
        return result;
    }

    private boolean isValid(Point p1, Point p2, Point p3) {
        return p1.x * p2.y + p3.x * p1.y + p2.x * p3.y < p3.x * p2.y + p2.x * p1.y + p1.x * p3.y;
    }
}
