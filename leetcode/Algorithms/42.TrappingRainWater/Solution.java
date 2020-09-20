class Solution {
    public int trap(int[] height) {
        int start = 0, end = height.length - 1, result = 0;
        while (start + 1 < end) {
            int fence = start;
            while (start + 1 < end && height[fence] <= height[end]) {
                if (height[start + 1] > height[fence]) {
                    fence = start + 1;
                } else {
                    result += height[fence] - height[start + 1];
                }
                start++;
            }

            fence = end;
            while (start < end - 1 && height[start] > height[fence]) {
                if (height[end - 1] > height[fence]) {
                    fence = end - 1;
                } else {
                    result += height[fence] - height[end - 1];
                }
                end--;
            }
        }
        return result;
    }
}
