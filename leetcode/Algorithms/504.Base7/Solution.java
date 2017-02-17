public class Solution {
    public String convertToBase7(int num) {
        int base = 1, result = 0;
        while (num != 0) {
            int mod = num % 7;
            result += base * mod;
            num = (num - mod) / 7;
            base *= 10;
        }
        return String.valueOf(result);
    }
}
