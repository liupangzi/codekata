public class Solution {
    public int superPow(int a, int[] b) {
        int exp = 0;
        for (int i : b) exp = (exp * 10 + i) % 1140;
        a %= 1337;

        int result = 1;
        while (exp != 0) {
            if ((exp & 1) != 0) result = (result * a) % 1337;
            a = (a * a) % 1337;
            exp >>= 1;
        }
        return result;
    }
}
