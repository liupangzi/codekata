import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval.end));
        int result = 0, end = intervals[0].end;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < end) {
                result++;
            } else {
                end = intervals[i].end;
            }
        }
        return result;
    }
}
