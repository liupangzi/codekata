import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String line;
        while ((line = stdin.readLine()) != null) {
            int[] tmp = new int[26];
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ' ') tmp[line.charAt(i) - 'a']++;
            }

            ArrayList<String> arrayList = new ArrayList<>();
            char[] s = new char[]{'$', ':', '#'};
            for (int i = 0; i < 26; i++) {
                if ((i == 0 || tmp[i - 1] == 0) && tmp[i] != 0) s[0] = (char) (i + 'a');
                if ((i + 1 == 26 || tmp[i + 1] == 0) && tmp[i] != 0) {
                    s[2] = (char) (i + 'a');
                    arrayList.add(new String(s));
                }
            }

            String result = arrayList.toString();
            stdout.println(result.substring(1, result.length() - 1));
        }
        stdout.close();
    }
}
