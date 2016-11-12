public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int result = 0, cache[] = new int[]{1, 9, 81, 648, 4536, 27216, 136080, 544320, 1632960, 3265920, 3265920};
        for (int i = Math.min(n, 10); i >= 0; i--) {
            result += cache[i];
        }
        return result;
    }
}
