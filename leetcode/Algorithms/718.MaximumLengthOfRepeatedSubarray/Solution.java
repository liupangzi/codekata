class Solution {
    public int findLength(int[] A, int[] B) {
        int result = 0, aStart = A.length - 1, bStart = 0;
        while (bStart < B.length) {
            int tmp = 0;
            if (aStart > 0) {
                for (int i = 0; i < Math.min(B.length, A.length - aStart); i++) {
                    if (B[i] == A[i + aStart]) {
                        tmp++;
                        result = Math.max(tmp, result);
                    } else {
                        tmp = 0;
                    }
                }
                aStart--;
            } else {
                for (int i = bStart; i < Math.min(B.length, bStart + A.length); i++) {
                    if (B[i] == A[i - bStart]) {
                        tmp++;
                        result = Math.max(tmp, result);
                    } else {
                        tmp = 0;
                    }
                }
                bStart++;
            }
        }
        return result;
    }
}
