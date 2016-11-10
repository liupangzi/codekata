public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, startLimit = nums.length - 1;
        while (start < startLimit) {
            int mid = (start + startLimit) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                startLimit = mid;
            }
        }

        if (nums[start] != target) return new int[]{-1, -1};

        int end = start, endLimit = nums.length - 1;
        while (end < endLimit) {
            int mid = (end + endLimit) / 2;
            if (nums[mid] > target) {
                endLimit = mid;
            } else {
                end = mid + 1;
            }
        }

        return nums[end] == target ? new int[]{start, end} : new int[]{start, end - 1};
    }
}
