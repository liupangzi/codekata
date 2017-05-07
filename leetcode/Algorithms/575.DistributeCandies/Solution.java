import java.util.HashSet;

public class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        int len = candies.length / 2;
        for (int c : candies) {
            set.add(c);
            if (set.size() >= len) return len;
        }
        return set.size();
    }
}
