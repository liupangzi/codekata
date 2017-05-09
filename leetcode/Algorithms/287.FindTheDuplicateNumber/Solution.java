public class Solution {
    public int findDuplicate(int[] nums) {
        int start = 1, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2, equal = 0, less = 0;
            for (int num : nums) {
                if (num < mid) less++;
                if (num == mid) equal++;
            }
            if (equal > 1) return mid;
            if (less > mid - 1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
