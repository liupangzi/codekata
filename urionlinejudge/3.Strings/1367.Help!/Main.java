import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String line;
        while ((line = stdin.readLine()) != null && !line.equals("0")) {
            int count = Integer.parseInt(line), cache[] = new int[26], result = 0, sum = 0;
            while (count-- > 0) {
                String tmp = stdin.readLine();
                if (tmp.indexOf("incorrect") != -1) {
                    cache[tmp.charAt(0) - 'A'] += 20;
                } else {
                    sum++;
                    result += Integer.parseInt(tmp.substring(2, tmp.indexOf(' ', 3))) + cache[tmp.charAt(0) - 'A'];
                }
            }
            stdout.printf("%d %d\n", sum, result);
        }
        stdout.close();
    }
}
