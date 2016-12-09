import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String[] numbers = stdin.readLine().split(" ");
        int n = Integer.parseInt(numbers[0]), count = Integer.parseInt(numbers[1]), result = 0;
        boolean tmp[] = new boolean[n];
        while (count-- > 0) {
            String action = stdin.readLine();
            if (action.equals("CLOSEALL")) {
                tmp = new boolean[n];
                result = 0;
            } else {
                int k = Integer.parseInt(action.substring(action.indexOf(' ') + 1));
                tmp[k - 1] = !tmp[k - 1];
                result += tmp[k - 1] ? 1 : -1;
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
