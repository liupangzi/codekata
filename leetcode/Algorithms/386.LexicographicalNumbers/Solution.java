public class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        int boundary = Math.min(n, 9);
        for (int j = 1; j <= boundary; j++) {
            result.add(j);
            nextRound(result, j, n);
        }

        return result;
    }
    
    public static void nextRound(List<Integer> result, int current, int n) {
        int count = 0;
        while (count < 10 && (current * 10 + count) <= n) {
            result.add(current * 10 + count);
            nextRound(result, current * 10 + count, n);
            count++;
        }
    }
}
