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
            int result = 0;
            char pre = '!', cur = '@', next;
            for (int i = 0; i < line.length(); i++) {
                if ((i == 0 || line.charAt(i - 1) == ' ') && line.charAt(i) != ' ') {
                    next = line.charAt(i) < 96 ? (char) (line.charAt(i) + 32) : line.charAt(i);
                    if (cur == next && pre != next) result++;
                    pre = cur;
                    cur = next;
                }
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
