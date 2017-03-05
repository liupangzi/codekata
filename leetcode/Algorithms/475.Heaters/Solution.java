import java.util.Arrays;

public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int heaterIndex = 0, result = 0;
        for (int house : houses) {
            while (heaterIndex < heaters.length - 1 && heaters[heaterIndex] + heaters[heaterIndex + 1] <= house * 2) {
                heaterIndex++;
            }
            result = Math.max(result, Math.abs(heaters[heaterIndex] - house));
        }

        return result;
    }
}
