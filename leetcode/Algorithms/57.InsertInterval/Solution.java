import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();
        for (Interval interval : intervals) {
            if (newInterval == null) {
                result.add(interval);
            } else if (interval.end < newInterval.start) {
                result.add(interval);
            } else if (interval.start > newInterval.end) {
                result.add(newInterval);
                result.add(interval);
                newInterval = null;
            } else {
                newInterval.start = Math.min(interval.start, newInterval.start);
                newInterval.end = Math.max(interval.end, newInterval.end);
            }
        }
        if (newInterval != null) result.add(newInterval);
        return result;
    }
}
