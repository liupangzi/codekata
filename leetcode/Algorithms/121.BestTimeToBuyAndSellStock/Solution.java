public class Solution {
    public int maxProfit(int[] prices) {
        int tmp, result = 0, iEnd = prices.length - 1;
        for (int i = 0; i < iEnd; i++) {
            tmp = Math.max(0, prices[i + 1] - prices[i]);
            result = Math.max(tmp, result);
        }
        return result;
    }
}
