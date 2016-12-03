import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String first;
        while ((first = stdin.readLine()) != null && first.length() != 0) {
            int result = 0;
            String second = stdin.readLine();
            int fLength = first.length(), sLength = second.length();
            for (int i = 0; i < fLength; i++) {
                int position = -1;
                while ((position = second.indexOf(first.charAt(i), position + 1)) != -1) {
                    int tmpResult = 0, m = i, n = position;
                    while (m < fLength && n < sLength && first.charAt(m) == second.charAt(n)) {
                        tmpResult++;
                        m++;
                        n++;
                    }
                    result = Math.max(result, tmpResult);
                }
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
