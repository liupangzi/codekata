import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        long[] tmp = new long[]{
                1L,
                1L,
                2L,
                6L,
                24L,
                120L,
                720L,
                5040L,
                40320L,
                362880L,
                3628800L,
                39916800L,
                479001600L,
                6227020800L,
                87178291200L,
                1307674368000L,
                20922789888000L,
                355687428096000L,
                6402373705728000L,
                121645100408832000L,
                2432902008176640000L
        };

        String line;
        while ((line = stdin.readLine()) != null && line.length() != 0) {
            int a = Integer.parseInt(line.substring(0, line.indexOf(' ')));
            int b = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
            System.out.println(tmp[a] + tmp[b]);
        }
        stdout.close();
    }
}
