import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine());
        while (count-- > 0) {
            int sum = Integer.parseInt(stdin.readLine());
            String origin = stdin.readLine();
            for (int j = 1; j < sum; j++) {
                if (!origin.equals(stdin.readLine())) origin = "ingles";
            }
            stdout.println(origin);
        }
        stdout.close();
    }
}
