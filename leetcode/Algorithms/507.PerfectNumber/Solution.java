public class Solution {
    public boolean checkPerfectNumber(int num) {
        int end = (int) Math.sqrt((double) num), result = num;
        for (int i = 2; i <= end; i++) {
            if (num % i == 0) {
                result -= i + num / i;
            }
        }
        return result == 1 && num != 1;
    }
}
