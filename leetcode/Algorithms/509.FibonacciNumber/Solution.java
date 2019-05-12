class Solution {
    public int fib(int N) {
        int a = 0, b = 1;
        for (int i = 1; i < N; i++) {
            int tmp = b;
            b += a;
            a = tmp;
        }
        return N < 1 ? a : b;
    }
}