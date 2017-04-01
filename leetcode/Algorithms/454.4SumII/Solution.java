import java.util.HashMap;

public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int a : A) {
            for (int b : B) {
                m.put(a + b, m.getOrDefault(a + b, 0) + 1);
            }
        }

        int result = 0;
        for (int c : C) {
            for (int d : D) {
                result += m.getOrDefault(-c - d, 0);
            }
        }
        return result;
    }
}
