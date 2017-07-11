public class Solution {
    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length < 2) return;

        int mid = quickSelect(nums, 0, nums.length - 1, nums.length / 2), start = 0, end = nums.length - 1;

        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] > mid) continue;
            while (end >= 0 && (nums[end] <= mid || (end < i && end % 2 == 1))) end--;
            if (end >= 0) swap(nums, i, end--);
        }

        for (int j = nums.length % 2 == 1 ? nums.length - 1 : nums.length - 2; j >= 0; j -= 2) {
            if (nums[j] < mid) continue;
            while (start < nums.length && (nums[start] >= mid || (start > j && start % 2 == 0))) start++;
            if (start < nums.length) swap(nums, j, start++);
        }
    }

    private int quickSelect(int[] nums, int start, int end, int k) {
        int pivot = nums[start], i = start, j = end;

        while (i < j) {
            while (nums[j] <= pivot && j > i) j--;
            nums[i] = nums[j];
            while (nums[i] >= pivot && i < j) i++;
            nums[j] = nums[i];
        }
        nums[i] = pivot;

        if (i == k) {
            return pivot;
        } else if (i < k) {
            return quickSelect(nums, i + 1, end, k);
        } else {
            return quickSelect(nums, start, i - 1, k);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
