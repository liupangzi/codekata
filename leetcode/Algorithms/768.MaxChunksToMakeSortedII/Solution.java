class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[] min = new int[arr.length], max = new int[arr.length];
        int minLength = 0, maxLength = 0, tmpMax = 0;
        for (int n : arr) {
            while (minLength > 0 && min[minLength - 1] > n) {
                minLength--;
                maxLength--;
            }
            min[minLength++] = n;
            tmpMax = Math.max(tmpMax, n);
            max[maxLength++] = tmpMax;
        }

        int result = 0, minCursor = 0, maxCursor = 0;
        while (minCursor < minLength) {
            minCursor++;
            while (minCursor < minLength && max[maxCursor] > min[minCursor]) {
                maxCursor++;
                minCursor++;
            }
            result++;
            maxCursor++;
        }
        return result;
    }
}
