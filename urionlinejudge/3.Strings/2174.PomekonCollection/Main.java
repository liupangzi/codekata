import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        HashMap<String, Integer> cache = new HashMap<>();
        int count = Integer.parseInt(stdin.readLine()), missing = 151;
        while (count-- > 0) {
            String pomekon = stdin.readLine();
            if (!cache.containsKey(pomekon)) {
                cache.put(pomekon, 0);
                missing--;
            }
        }
        stdout.println("Falta(m) " + missing + " pomekon(s).");
        stdout.close();
    }
}
