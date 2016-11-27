import java.util.HashMap;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

public class Solution {
    public int[] findRightInterval(Interval[] intervals) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < intervals.length; i++)
            cache.put(intervals[i].start, i);

        int[] result = new int[intervals.length];
        for (int j = 0; j < intervals.length; j++)
            result[j] = cache.getOrDefault(intervals[j].end, -1);

        return result;
    }
}
