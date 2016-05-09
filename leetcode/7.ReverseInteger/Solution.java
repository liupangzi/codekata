public class Solution {
    public int reverse(int x) {
        if (x < 10 && x > -10) return x;

        int result = 0;
        int tmp = x;

        while (tmp >= 10 || tmp <= -10) {
            result = (tmp > 0) ? result * 10 + tmp % 10 : result * 10 - tmp % 10 ;
            tmp /= 10;
        }

        if (tmp > 0) {
            if ((Integer.MAX_VALUE / 10 < result)
                    || (Integer.MAX_VALUE / 10 == result && Integer.MAX_VALUE % 10 < tmp)) {
                return 0;
            }
        }

        if (tmp < 0) {
            if ((Integer.MIN_VALUE / 10 > -result)
                    || ((Integer.MIN_VALUE / 10 == -result) && (Integer.MIN_VALUE % 10 > -tmp))) {
                return 0;
            }
        }

        return (tmp > 0) ? result * 10 + tmp : -result * 10 + tmp;
    }
}
