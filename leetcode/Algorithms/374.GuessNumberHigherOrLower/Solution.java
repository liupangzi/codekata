public class Solution{
    public int guessNumber(int n) {
        int min = 1, max = n;
        while (min < max) {
            int tmp = min + ((max - min) >> 1);
            if (guess(tmp) == 1) {
                min = tmp + 1;
            } else {
                max = tmp;
            }
        }
        return min;
    }
}
