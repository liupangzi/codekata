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
            String s = stdin.readLine();
            int p1 = s.indexOf(' '), p2 = s.indexOf(' ', p1 + 1);
            long C = Long.valueOf(s.substring(0, p1));
            long D = Long.valueOf(s.substring(p1 + 1, p2));
            long L = Long.valueOf(s.substring(p2 + 1));
            long max = C * 4 + D * 4;
            long min = C > D * 2 ? (C - D) * 4 : D * 4;
            if (L <= max && L >= min && L % 4 == 0) {
                stdout.println("yes");
            } else {
                stdout.println("no");
            }
        }
        stdout.close();
    }
}
