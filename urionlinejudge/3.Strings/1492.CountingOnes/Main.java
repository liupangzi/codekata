import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String line;
        while ((line = stdin.readLine()) != null && line.length() != 0) {
            long start = Long.parseLong(line.substring(0, line.indexOf(' '))) - 1;
            long end = Long.parseLong(line.substring(line.indexOf(' ') + 1));
            stdout.println(countOneSum(end) - countOneSum(start));
        }
        stdout.close();
    }

    private static long countOneSum(long n) {
        long tmp = ++n, result = 0, base = 1;
        while (tmp != 0) {
            result += n / (base * 2) * base + Math.max(0, n % (base * 2) - base);
            tmp >>= 1;
            base <<= 1;
        }
        return result;
    }
}
