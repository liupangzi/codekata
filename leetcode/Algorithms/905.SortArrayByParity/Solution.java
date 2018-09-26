class Solution {
    public int[] sortArrayByParity(int[] A) {
        int even = 0, odd = A.length - 1;
        while (even < odd) {
            if ((A[even] & 1) == 0) {
                even++;
            } else if ((A[odd] & 1) == 1) {
                odd--;
            } else {
                int tmp = A[odd];
                A[odd] = A[even];
                A[even] = tmp;
                even++;
                odd--;
            }
        }
        return A;
    }
}
