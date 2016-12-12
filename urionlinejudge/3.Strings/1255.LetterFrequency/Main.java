import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine());
        while (count-- > 0) {
            char[] line = stdin.readLine().toCharArray();
            int[] tmp = new int[26];
            for (char c : line) {
                if (65 <= c && c <= 90) {
                    tmp[c - 'A']++;
                } else if (97 <= c && c <= 122) {
                    tmp[c - 'a']++;
                }
            }

            StringBuilder result = new StringBuilder();
            int max = 0;
            for (int j = 0; j < 26; j++) {
                if (tmp[j] != 0) {
                    if (tmp[j] > max) {
                        max = tmp[j];
                        result.setLength(0);
                        result.append((char) (j + 'a'));
                    } else if (tmp[j] == max) {
                        result.append((char) (j + 'a'));
                    }
                }
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
