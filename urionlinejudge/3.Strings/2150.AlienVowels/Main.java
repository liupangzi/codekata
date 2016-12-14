import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String line;
        while ((line = stdin.readLine()) != null && line.length() != 0) {
            int[] tmp = new int[128];
            for (int i = 0; i < line.length(); i++) tmp[line.charAt(i)]++;

            String s = stdin.readLine();
            int result = 0;
            for (int j = 0; j < s.length(); j++) {
                if (tmp[s.charAt(j)] > 0) result++;
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
