import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine());
        while (count-- > 0) {
            int sum = Integer.parseInt(stdin.readLine()), low = sum & 2047, high = sum >> 11, n = 0;
            while (low != 0) {
                low &= low - 1;
                n++;
            }
            stdout.println(high + n);
        }
        stdout.close();
    }
}
