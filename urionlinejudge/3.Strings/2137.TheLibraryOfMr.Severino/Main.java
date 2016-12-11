import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0) {
            int count = Integer.parseInt(s);
            String[] tmp = new String[count];
            for (int i = 0; i < count; i++) tmp[i] = stdin.readLine();
            Arrays.sort(tmp, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    int m = a.charAt(0) * 1000 + a.charAt(1) * 100 + a.charAt(2) * 10 + a.charAt(3);
                    int n = b.charAt(0) * 1000 + b.charAt(1) * 100 + b.charAt(2) * 10 + b.charAt(3);
                    return m - n;
                }
            });
            for (int j = 0; j < count; j++) stdout.println(tmp[j]);
        }
        stdout.close();
    }
}
