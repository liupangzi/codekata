import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        //return naive(nums, k);
        //return priorityQueue(nums, k);
        return quickSelect(nums, 0, nums.length - 1, k - 1);
    }

    private int naive(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
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

    private int priorityQueue(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) queue.poll();
        }
        return queue.peek();
    }
}
