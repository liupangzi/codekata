import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String predictPartyVictory(String senate) {
        int cursor = senate.length();
        Queue<Integer> R = new LinkedList<>(), D = new LinkedList<>();
        for (int i = 0; i < cursor; i++) {
            if (senate.charAt(i) == 'R') {
                R.add(i);
            } else {
                D.add(i);
            }
        }

        while (R.size() > 0 && D.size() > 0) {
            int r = R.poll(), d = D.poll();
            if (r > d) {
                D.add(cursor++);
            } else {
                R.add(cursor++);
            }
        }
        return R.size() > 0 ? "Radiant" : "Dire";
    }
}
