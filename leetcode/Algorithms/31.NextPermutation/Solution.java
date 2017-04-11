public class Solution {
    public void nextPermutation(int[] nums) {
        int peak = nums.length - 1;
        while (peak - 1 >= 0 && nums[peak - 1] >= nums[peak]) peak--;
        if (peak != 0) {
            int tmp = nums.length - 1;
            while (nums[tmp] <= nums[peak - 1]) tmp--;
            swap(nums, peak - 1, tmp);
        }

        int end = nums.length - 1;
        while (peak < end) {
            swap(nums, peak, end);
            peak++;
            end--;
        }
    }

    private void swap(int[] list, int m, int n) {
        int tmp = list[m];
        list[m] = list[n];
        list[n] = tmp;
    }
}
