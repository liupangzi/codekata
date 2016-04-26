public class Solution {
    public boolean isPalindrome(int x) {
                int tmp = 0;

        while(x > tmp) {
            tmp = tmp * 10 + x % 10;
            if(tmp == 0) return false;
            x /= 10;
        }

        return (x == tmp || x == tmp / 10);
    }
}
