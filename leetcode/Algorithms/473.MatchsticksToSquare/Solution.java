import java.util.Arrays;

public class Solution {
    public boolean makesquare(int[] nums) {
        Arrays.sort(nums);
        reverseArray(nums);
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum == 0 || sum % 4 != 0 || nums[nums.length - 1] > sum / 4) return false;
        return dfs(nums, 0, new int[]{sum / 4, sum / 4, sum / 4, sum / 4});
    }

    private boolean dfs(int[] nums, int index, int[] tmp) {
        if (index == nums.length) {
            return tmp[0] == 0 && tmp[1] == 0 && tmp[2] == 0;
        } else {
            for (int i = 0; i < 4; i++) {
                if (tmp[i] >= nums[index]) {
                    tmp[i] -= nums[index];
                    if (dfs(nums, index + 1, tmp)) return true;
                    tmp[i] += nums[index];
                }
            }
        }
        return false;
    }

    private void reverseArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            int tmp = array[i];
            array[i++] = array[j];
            array[j--] = tmp;
        }
    }
}
