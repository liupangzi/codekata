class Solution {
    public int binaryGap(int N) {
        int last = -1, current = 0, result = 0;
        while (N > 0) {
            if ((N & 1) == 1) {
                if (last != -1) {
                    result = Math.max(result, current - last);
                }
                last = current;
            }
            current++;
            N >>= 1;
        }
        return result;
    }
}
