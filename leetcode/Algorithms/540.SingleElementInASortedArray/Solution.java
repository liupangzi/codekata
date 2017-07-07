public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end - 1) {
            int mid = (start + end) / 2;
            if (nums[mid] == nums[mid + 1]) {
                if ((mid - start) % 2 == 0) {
                    start = mid + 2;
                } else {
                    end = mid - 1;
                }
            } else if (nums[mid] == nums[mid - 1]) {
                if ((mid - start - 1) % 2 == 0) {
                    start = mid + 1;
                } else {
                    end = mid - 2;
                }
            } else {
                return nums[mid];
            }
        }
        return nums[start];
    }
}
