public class Solution {
    public int hIndex(int[] citations) {
        int length = citations.length;
        if (length == 0 || citations[length - 1] == 0) return 0;

        int start = 0, end = length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (citations[mid] >= length - mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return length - start;
    }
}
