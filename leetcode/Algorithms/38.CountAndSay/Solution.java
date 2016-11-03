public class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String tmp = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1, bit = tmp.charAt(0), tmpLength = tmp.length();
        for (int i = 1; i < tmpLength; i++) {
            if (tmp.charAt(i) == bit) {
                count++;
            } else {
                result.append(count).append(Character.getNumericValue(bit));
                count = 1;
                bit = tmp.charAt(i);
            }
        }

        return result.append(count).append(Character.getNumericValue(bit)).toString();
    }
}
