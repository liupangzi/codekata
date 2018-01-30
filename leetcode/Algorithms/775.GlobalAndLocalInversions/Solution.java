class Solution {
    public boolean isIdealPermutation(int[] A) {
        int min = A[A.length - 1];
        for (int i = A.length - 3; i >= 0; i--) {
            if (A[i] > min) return false;
            min = Math.min(min, A[i + 1]);
        }
        return true;
    }
}
