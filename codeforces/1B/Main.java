import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int count = stdin.nextInt();
        while (count-- > 0) {
            String string = stdin.next();
            int cPosition = string.indexOf('C');
            if (cPosition > 1 && (string.charAt(cPosition - 1) < 58)) {
                System.out.println(numberToTitle(Integer.valueOf(string.substring(cPosition + 1))) + string.substring(1, cPosition));
            } else {
                int idx = 0;
                while (string.charAt(idx) > 64) idx++;
                System.out.println("R" + string.substring(idx) + "C" + titleToNumber(string.substring(0, idx)));
            }
        }
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
