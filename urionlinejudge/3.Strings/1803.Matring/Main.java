import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String[] tmp = new String[4];
        for (int i = 0; i < 4; i++) tmp[i] = stdin.readLine();

        int strLength = tmp[0].length(), numbers[] = new int[strLength];
        for (int j = 0; j < strLength; j++) {
            for (int k = 0; k < 4; k++) {
                numbers[j] = numbers[j] * 10 + tmp[k].charAt(j) - 48;
            }
        }

        for (int x = 1; x < strLength - 1; x++) {
            System.out.print((char) (((numbers[0] * numbers[x]) + numbers[strLength - 1]) % 257));
        }
        System.out.println("");
        stdout.close();
    }
}
