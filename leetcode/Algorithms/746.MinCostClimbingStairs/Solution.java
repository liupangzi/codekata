class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int two = 0, one = 0;
        for (int c : cost) {
            int next = Math.min(one, two) + c;
            two = one;
            one = next;
        }
        return Math.min(one, two);
    }
}
