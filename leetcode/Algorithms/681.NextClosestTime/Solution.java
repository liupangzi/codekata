import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public String nextClosestTime(String time) {
        HashSet<String> hours = new HashSet<>(), minutes = new HashSet<>();
        char[] chars = time.toCharArray();
        for (char a : chars) {
            if (a == ':') continue;
            for (char b : chars) {
                if (b == ':') continue;
                String n = new String(new char[]{a, b});
                if (a < '6') minutes.add(n);
                if (a < '2' || (a == '2' && b < '4')) hours.add(n);
            }
        }

        ArrayList<String> times = new ArrayList<>();
        for (String hour : hours) {
            for (String minute : minutes) {
                times.add(hour + ":" + minute);
            }
        }

        Collections.sort(times);
        return times.get((Collections.binarySearch(times, time) + 1) % times.size());
    }
}
