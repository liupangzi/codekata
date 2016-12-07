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
            int blank = line.length() / 2, a = 0, b = blank + 1, result = 0;
            while (a < blank) {
                result += (line.charAt(b++) - line.charAt(a++) + 26) % 26;
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
