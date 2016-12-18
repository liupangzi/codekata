import java.util.HashMap;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long n = Math.abs((long) numerator), d = Math.abs((long) denominator), i = n / d, left = n % d;

        StringBuilder result = new StringBuilder();
        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) result.append("-");
        result.append(i);

        if (left == 0) return result.toString();
        result.append(".");

        return result.append(getDecimal(left, d)).toString();
    }

    private StringBuilder getDecimal(long a, long b) {
        int index = 0;
        HashMap<Long, Integer> location = new HashMap<>();
        StringBuilder tmp = new StringBuilder();
        while (true) {
            if (a == 0) break;
            if (location.containsKey(a)) {
                tmp.insert(location.get(a), "(").append(")");
                break;
            } else {
                location.put(a, index++);
                tmp.append(a * 10 / b);
                a = a * 10 % b;
            }
        }
        return tmp;
    }
}
