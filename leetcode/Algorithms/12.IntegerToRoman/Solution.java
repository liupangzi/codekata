public class Solution {
    public String intToRoman(int num) {
        String[][] tmp = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"},
        };

        StringBuilder result = new StringBuilder(tmp[3][num / 1000]);
        result.append(tmp[2][(num % 1000) / 100]).append(tmp[1][(num % 100) / 10]).append(tmp[0][num % 10]);
        return result.toString();
    }
}
