public class Solution {
    public String decodeString(String s) {
        while (s.indexOf('[') > -1) {
            int start = s.indexOf('[');

            int numberStart = start - 1;
            while (numberStart >= 0 && Character.isDigit(s.charAt(numberStart))) {
                numberStart--;
            }
            int repeat = Integer.parseInt(s.substring(numberStart + 1, start));

            int end = start + 1;
            int occur = 1;
            while (end < s.length() && occur != 0) {
                if (s.charAt(end) == '[') occur++;
                if (s.charAt(end) == ']') occur--;
                end++;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(0, numberStart + 1));
            String x = s.substring(start + 1, end - 1);
            for (int j = 0; j < repeat; j++) {
                sb.append(x);
            }
            sb.append(s.substring(end));
            s = sb.toString();
        }

        return s;
    }
}
