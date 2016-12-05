import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.valueOf(stdin.readLine());
        while (count-- > 0) {
            String[] borders = stdin.readLine().split(" ");
            int start = Integer.parseInt(borders[0]), end = Integer.parseInt(borders[1]);
            StringBuilder first = new StringBuilder();
            for (int i = start; i <= end; i++) first.append(i);
            StringBuilder second = new StringBuilder(first);
            second.reverse();
            stdout.println(first.append(second));
        }
        stdout.close();
    }
}
