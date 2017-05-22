import java.util.ArrayList;

public class Solution {
    public String fractionAddition(String expression) {
        if (expression.charAt(0) != '-') expression = "+" + expression;
        int positive = expression.charAt(0) == '-' ? -1 : 1, num = 0;
        ArrayList<Integer> numerators = new ArrayList<>(), denominators = new ArrayList<>();
        for (char c : expression.toCharArray()) {
            if (c == '+' || c == '-') {
                denominators.add(num);
                num = 0;
                positive = c == '+' ? 1 : -1;
            } else if (c == '/') {
                numerators.add(positive * num);
                num = 0;
                positive = 1;
            } else {
                num = num * 10 + (c - 48);
            }
        }
        denominators.add(num);

        int sum = 0;
        for (int i = 0; i < numerators.size(); i++) {
            sum += numerators.get(i) * 2520 / denominators.get(i + 1);
        }
        int k = GCD(sum, 2520);
        return k < 0
                ? "-" + String.valueOf(sum / k) + "/" + String.valueOf(-2520 / k)
                : String.valueOf(sum / k) + "/" + String.valueOf(2520 / k);
    }

    private int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }
}
