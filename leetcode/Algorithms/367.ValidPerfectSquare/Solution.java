public class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = 46340;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low * low == num;
    }
}
