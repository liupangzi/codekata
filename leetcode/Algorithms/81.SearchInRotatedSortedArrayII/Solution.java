public class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[start] == target || nums[end] == target || nums[mid] == target) {
                return true;
            } else if (nums[mid] > target && (nums[start] < nums[end] || nums[mid] < nums[end])) {
                end = mid - 1;
            } else if (nums[mid] < target && (nums[start] < nums[end] || nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end--;
                start++;
            }
        }
        return nums.length > 0 && nums[start] == target;
    }
}
