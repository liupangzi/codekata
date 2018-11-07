class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int base = minutesToTest / minutesToDie + 1, result = 0;
        while (Math.pow((double) base, (double) result) < buckets) {
            result++;
        }
        return result;
    }
}
