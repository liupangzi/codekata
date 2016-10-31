public class Solution {
    public String addBinary(String a, String b) {
        int aLength = a.length() - 1, bLength = b.length() - 1, carry = 0;
        StringBuilder result = new StringBuilder();

        while (aLength >= 0 || bLength >= 0) {
            int tmpA = aLength < 0 ? 0 : a.charAt(aLength) - 48;
            int tmpB = bLength < 0 ? 0 : b.charAt(bLength) - 48;
            result.append((carry + tmpA + tmpB) & 1);
            carry = (carry + tmpA + tmpB) >> 1;
            aLength--;
            bLength--;
        }

        if (carry == 1) result.append(carry);
        return result.reverse().toString();
    }
}
