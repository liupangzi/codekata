import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.valueOf(stdin.readLine());
        while (count-- > 0) {
            int zero = 0, one = 0, negativeOne = 0, others = 0;
            String useless = stdin.readLine(), line = stdin.readLine(), table[] = line.split(" ");
            for (String str : table) {
                if (str.equals("-1")) {
                    negativeOne++;
                } else if (str.equals("1")) {
                    one++;
                } else if (str.equals("0")) {
                    zero++;
                } else {
                    others++;
                }
            }

            if (others == 0) {
                if (one == 0 && negativeOne > 1) {
                    // -1, -1, 0
                    stdout.println("no");
                } else {
                    // -1, -1, 1
                    stdout.println("yes");
                }
            } else if (others == 1) {
                if (negativeOne > 0) {
                    // 2, -1, 1xN, 0xN
                    stdout.println("no");
                } else {
                    // 2, 1xN, 0xN
                    stdout.println("yes");
                }
            } else {
                stdout.println("no");
            }
        }
        stdout.close();
    }
}
