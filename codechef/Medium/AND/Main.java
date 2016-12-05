import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        // Long.toBinaryString(1000000000L) == 111011100110101100101000000000 (30 bits)
        long tmp[] = new long[30];
        int count = Integer.valueOf(stdin.readLine());
        String[] strings = stdin.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            long longValue = Long.valueOf(strings[i]);
            int j = 0;
            while (longValue > 0) {
                tmp[j++] += longValue & 1;
                longValue >>= 1;
            }
        }

        long result = 0;
        for (int k = 0; k < 30; k++) result += tmp[k] * (tmp[k] - 1) * (1L << k);
        stdout.println(result >> 1);
        stdout.close();
    }
}
