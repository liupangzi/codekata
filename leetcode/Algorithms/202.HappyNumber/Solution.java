public class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        while (n != 1 && !cache.containsKey(n)) {
            cache.put(n, 0);
            int tmp = 0;
            while (n != 0) {
                tmp += (n % 10) * (n % 10);
                n /= 10;
            }
            n = tmp;
        }
        return n == 1;
    }
}
