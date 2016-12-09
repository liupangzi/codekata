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
            String line = stdin.readLine();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ' ' && (i == 0 || line.charAt(i - 1) == ' ')) result.append(line.charAt(i));
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
