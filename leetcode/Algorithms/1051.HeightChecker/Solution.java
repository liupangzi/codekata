import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] ordered = Arrays.copyOf(heights, heights.length);
        Arrays.sort(ordered);
        int result = 0;
        for (int i = 0; i < ordered.length; i++) {
            if (ordered[i] != heights[i]) result++;
        }
        return result;
    }
}