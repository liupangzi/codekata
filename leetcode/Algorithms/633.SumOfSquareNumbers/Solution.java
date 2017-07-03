public class Solution {
    public boolean judgeSquareSum(int c) {
        int bound = (int) Math.sqrt((double) c);
        for (int i = 0; i <= bound; i++) {
            double sqrt = Math.sqrt((double) (c - i * i));
            if (sqrt == (int) sqrt) return true;
        }
        return false;
    }
}
