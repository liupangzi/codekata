public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length, sum = 0, tmp = 0, result = -1;
        for (int i = 0; i < length; i++) {
            int delta = gas[i] - cost[i];
            sum += delta;
            if ((tmp += delta) >= 0) {
                if (result == -1) result = i;
            } else {
                tmp = 0;
                result = -1;
            }
        }
        return sum >= 0 ? result : -1;
    }
}
