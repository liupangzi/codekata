import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String line;
        boolean start = true;
        while ((line = stdin.readLine()) != null && line.length() != 0) {
            if (start) {
                start = false;
            } else {
                stdout.println("");
            }
            boolean isL = isLeapYear(line), isH = canBeDividedBy15(line), isB = isL && canBeDividedBy55(line);
            if (isL) stdout.println("This is leap year.");
            if (isH) stdout.println("This is huluculu festival year.");
            if (isB) stdout.println("This is bulukulu festival year.");
            if (!isL && !isH) stdout.println("This is an ordinary year.");
        }
        stdout.close();
    }

    private static boolean isLeapYear(String year) {
        int tmp = Integer.valueOf(year.substring(year.length() - 4, year.length()));
        return ((tmp % 4 == 0) && (tmp % 100 != 0)) || (tmp % 400 == 0);
    }

    private static boolean canBeDividedBy15(String year) {
        int sum = 0;
        for (int i = 0; i < year.length(); i++) sum += year.charAt(i) - 48;
        return sum % 3 == 0
                && (year.charAt(year.length() - 1) == '5' || year.charAt(year.length() - 1) == '0');
    }

    private static boolean canBeDividedBy55(String year) {
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < year.length(); i++) {
            if ((i & 1) == 1) {
                oddSum += year.charAt(i) - 48;
            } else {
                evenSum += year.charAt(i) - 48;
            }
        }
        return Math.abs(oddSum - evenSum) % 11 == 0
                && (year.charAt(year.length() - 1) == '5' || year.charAt(year.length() - 1) == '0');
    }
}
