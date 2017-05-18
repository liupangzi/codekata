import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int table[] = new int[amount + 1];
        Arrays.fill(table, -1);
        table[0] = 0;

        for (int i = 0; i <= amount; i++) {
            if (table[i] == -1) continue;
            for (int coin : coins) {
                if (i <= amount - coin) {
                    if (table[i + coin] == -1) {
                        table[i + coin] = table[i] + 1;
                    } else {
                        table[i + coin] = Math.min(table[i + coin], table[i] + 1);
                    }
                }
            }
        }
        return table[amount];
    }
}
