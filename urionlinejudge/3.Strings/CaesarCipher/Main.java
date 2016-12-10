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
            char[] line = stdin.readLine().toCharArray();
            int shift = Integer.parseInt(stdin.readLine());
            for (int i = 0; i < line.length; i++) {
                line[i] = (char) ((line[i] - 'A' + 26 - shift) % 26 + 'A');
            }
            stdout.println(new String(line));
        }
        stdout.close();
    }
}
