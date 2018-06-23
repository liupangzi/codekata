class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int start = 1, end = A.length - 2;
        while (start < end) {
            int mid = (start + end) / 2;
            if (A[mid - 1] < A[mid] && A[mid] < A[mid + 1]) {
                start = mid + 1;
            } else if (A[mid - 1] > A[mid] && A[mid] > A[mid + 1]) {
                end = mid;
            } else {
                return mid;
            }
        }
        return start;
    }
}
