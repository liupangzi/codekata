import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);
        int count = Integer.valueOf(stdin.readLine());
        int result = count % 3 == 0 ? (count / 3) * 2 : (count / 3) * 2 + 1;
        stdout.println(result);
        stdout.close();
    }
}
