import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i < bound; i *= x) {
            for (int j = 1; j + i <= bound; j *= y) {
                result.put(i + j, 0);
                if (y == 1) break;
            }
            if (x == 1) break;
        }
        return new ArrayList<>(result.keySet());
    }
}