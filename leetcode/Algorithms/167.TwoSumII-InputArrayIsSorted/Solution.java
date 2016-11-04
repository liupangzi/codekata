public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1, tmp;
        while ((tmp = numbers[start] + numbers[end]) != target) {
            if (tmp > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{start + 1, end + 1};
    }
}
