import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine());
        while (true) {
            String[] tmp = new String[count];
            int maxLength = 0;
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = stdin.readLine();
                maxLength = Math.max(maxLength, tmp[i].length());
            }

            for (String str : tmp) {
                int t = maxLength - str.length();
                for (int i = 0; i < t; i++) stdout.print(" ");
                stdout.println(str);
            }

            count = Integer.parseInt(stdin.readLine());
            if (count == 0) break;
            stdout.println("");
        }
        stdout.close();
    }
}
