import java.util.ArrayList;

public class Solution {
    public String getPermutation(int n, int k) {
        int[] table = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        ArrayList<Integer> cache = new ArrayList<>();
        for (int i = 1; i <= n; i++) cache.add(i);

        k--;
        StringBuilder result = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            int t = k / table[i];
            k %= table[i];
            result.append(cache.get(t));
            cache.remove(t);
        }
        return result.toString();
    }
}
