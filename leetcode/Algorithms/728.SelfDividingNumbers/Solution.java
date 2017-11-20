import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDividingNumber(i)) result.add(i);
        }
        return result;
    }

    private boolean isDividingNumber(int n) {
        int origin = n;
        while (n != 0) {
            int tmp = n % 10;
            if (tmp == 0 || origin % tmp != 0) return false;
            n /= 10;
        }
        return true;
    }
}
