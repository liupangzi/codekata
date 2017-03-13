public class Solution {
    private int result = 0;
    private int target;
    private int[] tmp;

    public int findTargetSumWays(int[] nums, int S) {
        target = S;
        tmp = nums;
        travel(0, 0);
        return result;
    }

    private void travel(int t, int index) {
        if (index == tmp.length - 1) {
            if (t + tmp[index] == target) result++;
            if (t - tmp[index] == target) result++;
        } else if (index < tmp.length - 1) {
            travel(t + tmp[index], index + 1);
            travel(t - tmp[index], index + 1);
        }
    }
}
