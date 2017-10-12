class Solution {
    public int[] constructArray(int n, int k) {
        int result[] = new int[n], start = n, end = n - k, cursor = n - 1;
        while (start >= end) {
            result[cursor--] = start--;
            if (start >= end) result[cursor--] = end++;
        }

        for (int i = n - k - 1; i >= 1; i--) {
            result[i - 1] = i;
        }
        return result;
    }
}
