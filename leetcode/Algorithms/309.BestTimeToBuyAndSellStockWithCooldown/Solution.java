public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int len = prices.length, sell[] = new int[len], keep[] = new int[len];
        sell[1] = prices[1] > prices[0] ? prices[1] - prices[0] : 0;
        for (int i = 2; i < len; i++) {
            keep[i] = Math.max(keep[i - 1], sell[i - 1]);
            sell[i] = Math.max(sell[i - 1] + prices[i] - prices[i - 1], sell[i]);
            sell[i] = Math.max(keep[i - 2] + prices[i] - prices[i - 1], sell[i]);
        }
        return Math.max(keep[len - 1], sell[len - 1]);
    }
}
