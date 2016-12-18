import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        long[] table = new long[]{0, 1, 1, 1, 2, 2, 4, 8, 12, 96, 108, 10368, 10476,
                108615168, 108625644, 11798392572168192L, 11798392680793836L};

        String line;
        while ((line = stdin.readLine()) != null && line.length() != 0) {
            stdout.println(table[Integer.parseInt(line) - 1]);
        }
        stdout.close();
    }
}
