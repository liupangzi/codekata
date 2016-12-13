import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String line;
        outer:
        while ((line = stdin.readLine()) != null) {
            long result = 0, n = -1;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'O' || line.charAt(i) == 'o') {
                    n = 0;
                } else if (line.charAt(i) == 'l') {
                    n = 1;
                } else if (48 <= line.charAt(i) && line.charAt(i) <= 57) {
                    n = line.charAt(i) - 48;
                } else if (line.charAt(i) == ',' || line.charAt(i) == ' ') {
                    continue;
                } else {
                    stdout.println("error");
                    continue outer;
                }

                result = result * 10 + n;
                if (result > 2147483647) {
                    stdout.println("error");
                    continue outer;
                }
            }

            if (n == -1) {
                stdout.println("error");
            } else {
                stdout.println(result);
            }
        }
        stdout.close();
    }
}
