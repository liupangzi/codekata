public class Solution {
    private int counter = 0;

    public int countArrangement(int N) {
        boolean[] tmp = new boolean[N + 1];
        travel(tmp, N);
        return counter;
    }

    private void travel(boolean[] tmp, int left) {
        if (left == 1) {
            counter++;
            return;
        }

        for (int i = 1; i < tmp.length; i++) {
            if (!tmp[i] && (i % left == 0 || left % i == 0)) {
                tmp[i] = true;
                travel(tmp, left - 1);
                tmp[i] = false;
            }
        }
    }
}
