public class Solution {
    public int magicalString(int n) {
        if (n == 0) return 0;

        int[] list = new int[Math.max(n, 3)];
        list[0] = 1;
        list[1] = 2;
        list[2] = 2;
        int result = 1, cursor = 2, last = 3;
        while (last < n) {
            int next = list[last - 1] == 2 ? 1 : 2, count = list[cursor++];
            list[last++] = next;
            if (next == 1) result++;
            if (count == 2 && last < n) {
                list[last++] = next;
                if (next == 1) result++;
            }
        }
        return result;
    }
}
