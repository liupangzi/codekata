class Solution {
    public boolean validMountainArray(int[] A) {
        int cursor = 1;
        while (cursor < A.length && A[cursor] > A[cursor - 1]) cursor++;
        if (cursor == 1 || cursor == A.length) return false;

        while (cursor < A.length && A[cursor] < A[cursor - 1]) cursor++;
        return cursor == A.length;
    }
}