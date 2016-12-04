import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);
        String string;

        while ((string = in.readLine()) != null && string.length() != 0) {
            StringBuilder result = new StringBuilder(string);
            boolean shouldUpper = true;
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == ' ') continue;
                if (shouldUpper) {
                    result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
                } else {
                    result.setCharAt(i, Character.toLowerCase(result.charAt(i)));
                }
                shouldUpper = !shouldUpper;
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
