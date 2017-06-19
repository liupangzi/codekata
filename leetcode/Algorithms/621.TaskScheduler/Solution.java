import java.util.Arrays;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] cache = new int[26];
        for (char c : tasks) cache[c - 'A']++;
        Arrays.sort(cache);

        int result = 0;
        while (cache[25] != 1) {
            for (int i = 25; i >= Math.max(0, 25 - n); i--) {
                if (cache[i] <= 0) break;
                cache[i]--;
            }
            result += n + 1;
            Arrays.sort(cache);
        }

        for (int i = 25; i >= 0; i--) {
            if (cache[i] != 1) break;
            result++;
        }
        return result;
    }
}
