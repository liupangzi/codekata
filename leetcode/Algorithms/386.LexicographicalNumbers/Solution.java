public class Solution {
    private List<Integer> result;
    private int n;

    public List<Integer> lexicalOrder(int n) {
        this.result = new ArrayList<>();
        this.n = n;
        nextRound(1);

        return result;
    }

    private void nextRound(int current) {
        result.add(current);
        if (current * 10 <= n) nextRound(10 * current);
        if (current < n && current % 10 < 9) nextRound(current + 1);
    }
}
