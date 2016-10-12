public class Solution {
    public boolean isPowerOfThree(int n) {
        while (n >= 3 && n % 3 == 0) n /= 3;
        return n == 1;
    }
}
