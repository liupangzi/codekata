public class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0, cache[] = new int[nums.length + 1], result[] = new int[2];
        for (int num : nums) {
            if (cache[num] != 0) {
                result[0] = num;
            } else {
                cache[num] = num;
            }
            sum += num;
        }
        result[1] = nums.length * (nums.length + 1) / 2 - sum + result[0];
        return result;
    }
}
