import java.util.List;

public class Solution {
    private int result = Integer.MAX_VALUE;

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        dfs(price, special, needs, 0, 0);
        return result;
    }

    private void dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int index, int current) {
        if (index == special.size()) {
            for (int i = 0; i < needs.size(); i++) current += needs.get(i) * price.get(i);
            result = Math.min(result, current);
            return;
        }

        int count = Integer.MAX_VALUE;
        for (int i = 0; i < needs.size(); i++) {
            if (special.get(index).get(i) != 0) {
                count = Math.min(count, needs.get(i) / special.get(index).get(i));
            }
        }

        int thisOffer = special.get(index).get(special.get(index).size() - 1);
        for (int i = 0; i <= count; i++) {
            for (int j = 0; j < needs.size(); j++) needs.set(j, needs.get(j) - special.get(index).get(j) * i);
            current += thisOffer * i;
            dfs(price, special, needs, index + 1, current);
            current -= thisOffer * i;
            for (int j = 0; j < needs.size(); j++) needs.set(j, needs.get(j) + special.get(index).get(j) * i);
        }
    }
}
