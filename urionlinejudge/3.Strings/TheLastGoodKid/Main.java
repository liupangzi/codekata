import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String result = stdin.readLine(), newOne;
        outer:
        while ((newOne = stdin.readLine()) != null && newOne.length() != 0) {
            int i = 0, j = 0;
            while (i < result.length() && j < newOne.length()) {
                char a = Character.toLowerCase(result.charAt(i++));
                char b = Character.toLowerCase(newOne.charAt(j++));
                if (a == b) continue;
                if (a < b) result = newOne;
                continue outer;
            }
            if (i == result.length()) result = newOne;
        }
        stdout.println(result);
        stdout.close();
    }
}
