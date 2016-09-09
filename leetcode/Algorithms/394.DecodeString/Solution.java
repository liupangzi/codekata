public class Solution {
    public String decodeString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        while (stringBuilder.indexOf("[") > -1) {
            int start = stringBuilder.indexOf("[");

            int numberStart = start - 1;
            while (numberStart >= 0 && Character.isDigit(stringBuilder.charAt(numberStart))) {
                numberStart--;
            }
            int number = Integer.parseInt(stringBuilder.substring(numberStart + 1, start));

            int end = start + 1;
            int occur = 1;
            while (end < stringBuilder.length() && occur != 0) {
                if (stringBuilder.charAt(end) == '[') occur++;
                if (stringBuilder.charAt(end) == ']') occur--;
                end++;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(stringBuilder.substring(0, numberStart + 1));
            String x = stringBuilder.substring(start + 1, end - 1);
            for (int j = 0; j < number; j++) {
                sb.append(x);
            }
            sb.append(stringBuilder.substring(end));
            stringBuilder = sb;
        }

        return stringBuilder.toString();
    }
}
