import java.util.Collections;
import java.util.List;

public class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int result = 720;
        for (int i = 0; i < timePoints.size(); i++) {
            String m = timePoints.get(i), n = timePoints.get((i + 1) % timePoints.size());
            int a = ((m.charAt(0) - 48) * 10 + m.charAt(1) - 48) * 60 + (m.charAt(3) - 48) * 10 + m.charAt(4) - 48;
            int b = ((n.charAt(0) - 48) * 10 + n.charAt(1) - 48) * 60 + (n.charAt(3) - 48) * 10 + n.charAt(4) - 48;
            result = Math.min(result, Math.min(((a - b) + 1440) % 1440, ((b - a) + 1440) % 1440));
        }
        return result;
    }
}
