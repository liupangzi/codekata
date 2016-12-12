import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine()), start = 0, end = 0;
        char[] tmp = stdin.readLine().toCharArray();
        while (count-- > 0) {
            while (end < tmp.length && tmp[end] != ' ') end++;
            if (end - start == 3 &&
                    ((tmp[start] == 'O' && tmp[start + 1] == 'B') || (tmp[start] == 'U' && tmp[start + 1] == 'R'))) {
                tmp[start + 2] = 'I';
            }
            end++;
            start = end;
        }
        stdout.println(new String(tmp));
        stdout.close();
    }
}
