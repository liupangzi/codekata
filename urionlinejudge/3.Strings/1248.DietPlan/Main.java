import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine());
        while (count-- > 0) {
            String all = stdin.readLine(), b = stdin.readLine(), l = stdin.readLine();
            int[] tmp = new int[26];
            for (int i = 0; i < all.length(); i++) tmp[all.charAt(i) - 'A']++;
            for (int i = 0; i < b.length(); i++) tmp[b.charAt(i) - 'A']--;
            for (int i = 0; i < l.length(); i++) tmp[l.charAt(i) - 'A']--;

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (tmp[i] < 0) {
                    result = new StringBuilder("CHEATER");
                    break;
                } else if (tmp[i] == 1){
                    result.append((char) (i + 'A'));
                }
            }
            stdout.println(result);
        }
        stdout.close();
    }
}
