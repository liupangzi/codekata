import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.valueOf(stdin.readLine());
        outer:
        while (count-- > 0) {
            String s = stdin.readLine();
            int blank = s.indexOf(' '), len = s.length();
            if (blank * 2 + 1 - len < 0) {
                stdout.println("nao encaixa");
                continue;
            }

            for (int i = 0; i < len - blank - 1; i++) {
                if (s.charAt(blank * 2 - len + 1 + i) != s.charAt(blank + 1 + i)) {
                    stdout.println("nao encaixa");
                    continue outer;
                }
            }
            stdout.println("encaixa");
        }
        stdout.close();
    }
}
