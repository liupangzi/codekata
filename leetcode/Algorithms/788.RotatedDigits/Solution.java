class Solution {
    public int rotatedDigits(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) result += helper(i);
        return result;
    }

    private int helper(int N) {
        int diff = 0;
        while (N > 0) {
            int tmp = N % 10;
            if (tmp == 3 || tmp == 4 || tmp == 7) return 0;
            if (tmp == 2 || tmp == 5 || tmp == 6 || tmp == 9) diff++;
            N /= 10;
        }
        return diff > 0 ? 1 : 0;
    }
}
