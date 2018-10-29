class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int start = 0, end = A.length - 1;
        while (start < A.length) {
            if (A[start] % 2 == 0) {
                start += 2;
            } else if (A[end] % 2 == 1) {
                end -= 2;
            } else {
                int tmp = A[start];
                A[start] = A[end];
                A[end] = tmp;
                start += 2;
                end -= 2;
            }
        }
        return A;
    }
}
