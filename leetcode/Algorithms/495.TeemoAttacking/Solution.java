public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = timeSeries.length > 0 ? duration : 0;
        for (int i = 1; i < timeSeries.length; i++) {
            result += Math.min(timeSeries[i] - timeSeries[i - 1], duration);
        }
        return result;
    }
}
