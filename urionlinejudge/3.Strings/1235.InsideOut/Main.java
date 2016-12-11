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
            char[] tmp = stdin.readLine().toCharArray();
            int start = 0, end = tmp.length - 1, halfStart = end / 2, halfEnd = halfStart + 1;
            char c;
            while (start < halfStart) {
                c = tmp[halfStart];
                tmp[halfStart] = tmp[start];
                tmp[start] = c;
                halfStart--;
                start++;
                c = tmp[end];
                tmp[end] = tmp[halfEnd];
                tmp[halfEnd] = c;
                end--;
                halfEnd++;
            }
            stdout.println(new String(tmp));
        }
        stdout.close();
    }
}
