public class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";

        int i = 0;
        StringBuilder left = new StringBuilder();
        while (i < num.length() && k > 0) {
            if ((left.length() > 0) && (left.charAt(left.length() - 1) > num.charAt(i))) {
                left.setLength(left.length() - 1);
                k--;
            } else {
                left.append(num.charAt(i));
                i++;
            }
        }

        StringBuilder result = k > 0
                ? new StringBuilder(left.substring(0, left.length() - k))
                : left.append(num.substring(i));

        int index = 0;
        while (result.charAt(index) == '0' && index < result.length() - 1) {
            index++;
        }

        return result.substring(index);
    }
}
