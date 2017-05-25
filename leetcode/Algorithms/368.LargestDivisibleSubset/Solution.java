import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();

        Arrays.sort(nums);
        int pointer[] = new int[nums.length], length[] = new int[nums.length], max = 0;
        for (int i = 0; i < nums.length; i++) {
            pointer[i] = -1;
            length[i] = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            int start = Arrays.binarySearch(nums, 0, i, nums[i] / 2);
            if (start < 0) start = -(start + 1);
            if (start == i) start--;
            while (start >= 0) {
                if (nums[i] % nums[start] == 0 && length[i] < length[start] + 1) {
                    pointer[i] = start;
                    length[i] = length[start] + 1;
                }
                start--;
            }
            if (length[i] > length[max]) max = i;
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (max != -1) {
            result.add(nums[max]);
            max = pointer[max];
        }
        return result;
    }
}
