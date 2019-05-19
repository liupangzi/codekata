import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int tmp = 0;
        ArrayList<Boolean> result = new ArrayList<>();
        for (int a : A) {
            tmp <<= 1;
            tmp += a;
            tmp %= 5;
            result.add(tmp == 0);
        }
        return result;
    }
}