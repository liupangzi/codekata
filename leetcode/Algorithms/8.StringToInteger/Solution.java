public class Solution {
    public int myAtoi(String str) {
        if (str.length() == 0 ) return 0;

        int result = 0;
        boolean isNegative = false;
        int tenPercentMin = Integer.MIN_VALUE / 10;
        int suffixMin = Integer.MIN_VALUE % 10;
        int tenPercentMax = Integer.MAX_VALUE / 10;
        int suffixMax = Integer.MAX_VALUE % 10;

        int i = 0;
        while ((str.charAt(i) == ' ' || str.charAt(i) == '\t') && i < str.length()) {
            i++;
        }

        if ((str.charAt(i) == '+' || str.charAt(i) == '-') && (i < str.length())) {
            if (str.charAt(i) == '-') isNegative = true;
            i++;
        }

        while (i < str.length()) {
            int charToInt = (int)str.charAt(i) - 48;
            if (charToInt <= 9 && charToInt >= 0) {
                if (isNegative) {
                    if (-result < tenPercentMin || ((-result == tenPercentMin) && (-charToInt < suffixMin))) {
                        return Integer.MIN_VALUE;
                    }
                }
                else {
                    if (result > tenPercentMax || ((result == tenPercentMax) && (charToInt > suffixMax))) {
                        return Integer.MAX_VALUE;
                    }
                }

                result = result * 10 + charToInt;
                i++;
            }
            else {
                break;
            }
        }

        return isNegative ? -result : result;
    }
}
