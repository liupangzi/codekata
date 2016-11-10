public class Solution {
    public int mySqrt(int x) {
        double result = (double) x + 1, tmp;
        while ((int) (tmp = ((result + x / result) / 2)) != (int) result) {
            result = tmp;
        }
        return (int) result;
    }
}
