import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int count = cin.nextInt();
        while (count-- > 0) {
            String string = cin.next();
            if (isExcel(string)) {
                System.out.println(ExcelToRXCY(string));
            } else {
                System.out.println(RXCYToExcel(string));
            }
        }
    }

    private static boolean isExcel(String x) {
        int idx = 0;
        while (idx < x.length() && x.charAt(idx) >= 65) idx++;
        while (idx < x.length() && x.charAt(idx) <= 57) idx++;
        return idx == x.length();
    }

    private static String ExcelToRXCY(String a) {
        int idx = 0;
        while (a.charAt(idx) >= 65) idx++;
        return "R" + a.substring(idx) + "C" + titleToNumber(a.substring(0, idx));
    }

    private static String RXCYToExcel(String b) {
        return numberToTitle(Integer.valueOf(b.substring(b.indexOf('C') + 1)))
                + b.substring(b.indexOf('R') + 1, b.indexOf('C'));
    }

    // https://leetcode.com/problems/excel-sheet-column-number/
    private static int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + s.charAt(i) - 'A' + 1;
        }
        return result;
    }

    // https://leetcode.com/problems/excel-sheet-column-title/
    private static String numberToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            result.insert(0, (char) ((n - 1) % 26 + 'A'));
            n = (n - 1) / 26;
        }
        return result.toString();
    }
}
