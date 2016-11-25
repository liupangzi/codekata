public class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, result = 0, tmp;
        while (i < j) {
            result = Math.max(result, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                tmp = height[i];
                while (i < j && height[i] <= tmp) i++;
            } else {
                tmp = height[j];
                while (j > i && height[j] <= tmp) j--;
            }
        }
        return result;
    }
}
