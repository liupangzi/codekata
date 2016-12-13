import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine());
        while (count-- > 0) {
            String line = stdin.readLine();
            String a = line.substring(0, line.indexOf(' '));
            String b = line.substring(line.indexOf(' ') + 1);
            if (a.length() >= b.length() && a.substring(a.length() - b.length()).equals(b)) {
                stdout.println("encaixa");
            } else {
                stdout.println("nao encaixa");
            }
        }
        stdout.close();
    }
}
