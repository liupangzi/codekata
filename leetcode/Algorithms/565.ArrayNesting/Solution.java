public class Solution {
    public int arrayNesting(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int cursor = i, tmp = 0;
            while (nums[cursor] > i) {
                int swap = cursor;
                cursor = nums[cursor];
                nums[swap] = i;
                tmp++;
            }
            result = Math.max(result, tmp);
        }
        return result + 1;
    }
}
