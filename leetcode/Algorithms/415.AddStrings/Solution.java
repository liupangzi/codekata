public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0) {
            int a = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int b = j >= 0 ? num2.charAt(j--) - '0' : 0;
            result.append((a + b + carry) % 10);
            carry = (a + b + carry) / 10;
        }
        if (carry == 1) result.append(carry);

        return result.reverse().toString();
    }
}
