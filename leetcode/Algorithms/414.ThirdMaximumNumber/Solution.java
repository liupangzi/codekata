public class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int n : nums) {
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (first > n && n > second) {
                third = second;
                second = n;
            } else if (second > n && n > third) {
                third = n;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}
