public class Solution {
    public int lastRemaining(int n) {
        int start = 1;
        int step = 2;
        while (start + step >= 1 && start + step <= n) {
            if (step > 0) {
                start = n - (n - start) % step;
                start += (n >= start + step / 2) ? step / 2 : -step / 2;
            } else {
                start = 1 + (start - 1) % (-step);
                start += (1 >= start + step / 2) ? -step / 2 : step / 2;
            }
            step *= -2;
        }

        int next = start + step / 2;
        return (next >= 1 && next <= n) ? next : start;
    }
}
