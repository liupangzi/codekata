class Solution {
    public boolean isMonotonic(int[] A) {
        boolean increasing = true, decreasing = true;
        for (int i = 1; i < A.length; i++) {
            int delta = A[i - 1] - A[i];
            increasing &= delta <= 0;
            decreasing &= delta >= 0;
        }
        return increasing || decreasing;
    }
}
