class Solution {
    public String largestTimeFromDigits(int[] A) {
        int[] result = new int[]{-1, -1, -1, -1};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) continue;
                int hour = A[i] * 10 + A[j];
                for (int m = 0; m < 4; m++) {
                    if (m == i || m == j) continue;
                    for (int n = 0; n < 4; n++) {
                        if (n == m || n == i || n == j) continue;
                        int min = A[m] * 10 + A[n];
                        if (hour > 23 || min > 59) continue;
                        if (hour < result[0] * 10 + result[1]) continue;
                        if (hour == result[0] * 10 + result[1] && min < result[2] * 10 + result[3]) continue;
                        result = new int[]{A[i], A[j], A[m], A[n]};
                    }
                }
            }
        }

        return result[0] == -1 ? "" : String.valueOf(result[0]) + String.valueOf(result[1]) + ":" + String.valueOf(result[2]) + String.valueOf(result[3]);
    }
}