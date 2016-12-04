import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int origin[] = new int[1000001], count = Integer.valueOf(stdin.readLine());
        while (count-- > 0) origin[Integer.valueOf(stdin.readLine())]++;
        for (int i = 0; i <= 1000000; i++) {
            int n = origin[i];
            while (n-- > 0) stdout.println(i);
        }
        stdout.close();
    }
}
