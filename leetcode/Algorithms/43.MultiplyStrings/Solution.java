public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length(), result[] = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                result[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }

        int carry = 0;
        for (int k = result.length - 1; k >= 0; k--) {
            int tmp = result[k] + carry;
            carry = tmp / 10;
            result[k] = tmp % 10;
        }

        int start = 0;
        while (start < result.length - 1 && result[start] == 0) start++;

        StringBuilder sb = new StringBuilder();
        while (start < result.length) sb.append((char) (result[start++] + '0'));
        return sb.toString();
    }
}
