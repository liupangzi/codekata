public class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                return mid;
            }
        }

        return (nums.length > 0 && nums[start] < target) ? start + 1 : start;
    }
}
