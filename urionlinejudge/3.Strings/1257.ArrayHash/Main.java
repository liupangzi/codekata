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
            int n = Integer.parseInt(stdin.readLine()), result = 0;
            for (int i = 0; i < n; i++) {
                String tmp = stdin.readLine();
                for (int j = 0, tmpLength = tmp.length(); j < tmpLength; j++) {
                    result += (tmp.charAt(j) - 'A') + i + j;
                }
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
