import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String input;
        while (!(input = stdin.readLine()).equals("0 0")) {
            String a = input.substring(0, input.indexOf(' '));
            String b = input.substring(input.indexOf(' ') + 1);
            stdout.println(String.valueOf(Integer.parseInt(a) + Integer.parseInt(b)).replace("0", ""));
        }
        stdout.close();
    }
}
