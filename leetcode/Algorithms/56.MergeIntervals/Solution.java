/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval a, Interval b) {
                return a.start == b.start ? a.end - b.end : a.start - b.start;
            }
        });

        ArrayList<Interval> result = new ArrayList<>();
        int index = 0, size = intervals.size();
        while (index < size) {
            int min = intervals.get(index).start, max = intervals.get(index).end;
            while (index + 1 < size && max >= intervals.get(index + 1).start) {
                index++;
                max = Math.max(max, intervals.get(index).end);
            }
            result.add(new Interval(min, max));
            index++;
        }
        return result;
    }
}
