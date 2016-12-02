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
            String string = stdin.readLine();
            int blankPosition = string.indexOf(' '), first = 0, second = blankPosition + 1;

            StringBuilder result = new StringBuilder();
            while (first < blankPosition && second < string.length()) {
                result.append(string.charAt(first++));
                result.append(string.charAt(second++));
            }

            if (first == blankPosition) {
                result.append(string.substring(second));
            } else {
                result.append(string.substring(first, blankPosition));
            }

            stdout.println(result);
        }
        stdout.close();
    }
}
