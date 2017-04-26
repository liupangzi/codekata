public class Solution {
    public String largestNumber(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        if (nums[nums.length - 1] == 0) return "0";

        StringBuilder result = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) result.append(nums[i]);
        return result.toString();
    }

    private void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) return;
        if (low >= high) return;

        int middle = low + (high - low) / 2, pivot = arr[middle], i = low, j = high;
        while (i <= j) {
            while (compare(arr[i], pivot) == -1) i++;
            while (compare(arr[j], pivot) == 1) j--;
            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }

    private int compare(int a, int b) {
        String x = String.valueOf(a) + String.valueOf(b), y = String.valueOf(b) + String.valueOf(a);
        int index = 0, len = x.length();
        while (index < len) {
            if (x.charAt(index) > y.charAt(index)) {
                return 1;
            } else if (x.charAt(index) < y.charAt(index)) {
                return -1;
            }
            index++;
        }
        return 0;
    }
}
