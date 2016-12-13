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
            long a = Long.parseLong(line.substring(0, line.indexOf(' ')));
            long b = Long.parseLong(line.substring(line.indexOf(' ') + 1));
            stdout.println(Math.abs(b - a));
        }
        stdout.close();
    }
}
