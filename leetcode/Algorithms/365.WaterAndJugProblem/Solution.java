public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        return helper(Math.min(x, y), Math.max(x, y), z);
    }

    private boolean helper(int min, int max, int target) {
        if (target > min + max) return false;
        if (min == 0) return max == 0 ? target == 0 : target % max == 0;
        return helper(max % min, min, target % min);
    }
}
