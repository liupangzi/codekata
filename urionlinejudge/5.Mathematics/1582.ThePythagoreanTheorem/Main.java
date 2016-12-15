import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0) {
            String[] line = s.split(" ");
            int[] table = new int[]{Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2])};
            Arrays.sort(table);
            int a = table[0], b = table[1], c = table[2];
            if (a * a + b * b == c * c) {
                if (gcd(a, gcd(b, c)) == 1) {
                    stdout.println("tripla pitagorica primitiva");
                } else {
                    stdout.println("tripla pitagorica");
                }
            } else {
                stdout.println("tripla");
            }

        }
        stdout.close();
    }

    private static int gcd(int a, int b) {
        if (a < b) return gcd(b, a);
        return b == 0 ? a : gcd(b, a % b);
    }
}
