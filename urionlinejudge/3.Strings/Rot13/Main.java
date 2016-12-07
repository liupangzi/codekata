import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0) {
            char[] tmp = s.toCharArray();
            for (int i = 0; i < tmp.length; i++) {
                if (('A' <= tmp[i] && tmp[i] <= 'M') || ('a' <= tmp[i] && tmp[i] <= 'm')) {
                    tmp[i] += 13;
                } else if (('N' <= tmp[i] && tmp[i] <= 'Z') || ('n' <= tmp[i] && tmp[i] <= 'z')) {
                    tmp[i] -= 13;
                }
            }
            stdout.println(new String(tmp));
        }
        stdout.close();
    }
}
