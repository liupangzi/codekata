import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String input;
        while ((input = stdin.readLine()) != null && input.length() != 0) {
            int iCount = 0, bCount = 0;
            String[] iTable = new String[]{"</i>", "<i>"}, bTable = new String[]{"</b>", "<b>"};
            StringBuilder result = new StringBuilder(input);
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == '_') {
                    iCount++;
                    result.replace(i, i + 1, iTable[iCount % 2]);
                } else if (result.charAt(i) == '*') {
                    bCount++;
                    result.replace(i, i + 1, bTable[bCount % 2]);
                }
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
