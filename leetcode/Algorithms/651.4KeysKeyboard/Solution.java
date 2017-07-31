public class Solution {
    public int maxA(int N) {
        if (N < 7) return N;
        int[] result = new int[N + 1];
        for (int i = 1; i < 7; i++) result[i] = i;
        for (int i = 7; i <= N; i++) {
            result[i] = Math.max(result[i - 1] + 1, Math.max(result[i - 5] * 4, result[i - 4] * 3));
        }
        return result[N];
    }
}
