import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String op;
        while ((op = stdin.readLine()) != null && op.length() != 0) {
            int procs = Integer.parseInt(stdin.readLine()), result = 0, start = 0;
            while (start < op.length()) {
                start++;
                if (op.charAt(start - 1) == 'R') {
                    int n = procs;
                    while (start < op.length() && op.charAt(start) == 'R' && --n != 0) start++;
                }
                result++;
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
