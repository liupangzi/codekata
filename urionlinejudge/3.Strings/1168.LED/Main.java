import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int table[] = new int[]{6, 2, 5, 5, 4, 5, 6, 3, 7, 6}, count = Integer.valueOf(stdin.readLine());
        while (count-- > 0) {
            String str = stdin.readLine();
            int tmp[] = new int[10], result = 0;
            for (int i = 0, len = str.length(); i < len; i++) tmp[str.charAt(i) - 48]++;
            for (int j = 0; j < 10; j++) result += tmp[j] * table[j];
            stdout.println(result + " leds");
        }
        stdout.close();
    }
}
