import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String line;
        while ((line = stdin.readLine()) != null && !line.equals("0")) {
            int n = Integer.parseInt(line), x = n / 2, y = n / 2, sum = n * n - 1;
            printTable(stdout, n, x, y);
            int step = 2, result = 0, direction = 0;
            while (result < sum) {
                int tmp = step >> 1, tmpStart = 0;
                while (result < sum && tmpStart < tmp) {
                    if (direction == 0) y++;
                    if (direction == 1) x--;
                    if (direction == 2) y--;
                    if (direction == 3) x++;
                    printTable(stdout, n, x, y);
                    result++;
                    tmpStart++;
                }
                direction = (direction + 1) % 4;
                step++;
            }
        }

        stdout.close();
    }

    private static void printTable(PrintWriter stdout, int n, int x, int y) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x == i && y == j) {
                    stdout.print('X');
                } else {
                    stdout.print('O');
                }
            }
            stdout.print("\n");
        }
        stdout.print("@\n");
    }
}
