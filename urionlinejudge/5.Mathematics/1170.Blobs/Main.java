import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine());
        double[] table = new double[]{
                1.0,
                2.0,
                4.0,
                8.0,
                16.0,
                32.0,
                64.0,
                128.0,
                256.0,
                512.0,
                1024.0,
        };
        while (count-- > 0) {
            double d = Double.parseDouble(stdin.readLine());
            int n = 0;
            while (d > table[n]) {
                n++;
            }
            stdout.printf("%d dias\n", n);
        }
        stdout.close();
    }
}
