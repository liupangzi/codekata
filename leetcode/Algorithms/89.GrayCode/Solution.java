import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        int base = 1;
        for (int i = 1; i <= n; i++) {
            int count = result.size() - 1;
            for (int j = count; j >= 0; j--) {
                result.add(base + result.get(j));
            }
            base <<= 1;
        }
        return result;
    }
}
