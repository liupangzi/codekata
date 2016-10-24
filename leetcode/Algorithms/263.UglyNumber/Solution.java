public class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        while ((num & 1) == 0) num >>= 1;
        while (num % 5 == 0) num /= 5;
        while (num % 3 == 0) num /= 3;
        return num == 1;
    }
}
