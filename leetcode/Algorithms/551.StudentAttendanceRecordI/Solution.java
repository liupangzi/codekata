public class Solution {
    public boolean checkRecord(String s) {
        int absent = 0, late = 0, index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == 'L' &&
                    index + 2 < s.length() &&
                    s.charAt(index + 1) == 'L' &&
                    s.charAt(index + 2) == 'L') {
                late++;
                index += 3;
            } else {
                if (s.charAt(index) == 'A') absent++;
                index++;
            }
        }
        return absent <= 1 && late == 0;
    }
}
