public class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int[] bucket = new int[n];
        bucket[0] = 1;
        bucket[1] = 2;
        for (int i = 2; i < n; i++) {
            bucket[i] = bucket[i - 1] + bucket[i - 2];
        }

        return bucket[n - 1];
    }
}
