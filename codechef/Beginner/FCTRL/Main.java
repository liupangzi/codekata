import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.valueOf(stdin.readLine());
        while (count-- > 0) {
            int result = 0, n = Integer.valueOf(stdin.readLine());
            while (n >= 5) {
                n /= 5;
                result += n;
            }
            stdout.println(result);
        }

        stdout.close();
    }
}
