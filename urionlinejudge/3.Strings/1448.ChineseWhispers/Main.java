import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine()), sum = count;
        while (count-- > 0) {
            stdout.printf("Instancia %d\n", sum - count);
            String origin = stdin.readLine(), a = stdin.readLine(), b = stdin.readLine();
            int delta = 0, firstMet = 0;
            for (int i = 0; i < origin.length(); i++) {
                char oc = origin.charAt(i), ac = a.charAt(i), bc = b.charAt(i);
                if (oc == ac) delta++;
                if (oc == bc) delta--;
                if (firstMet == 0 && ac != bc) {
                    if (ac == oc) firstMet = 1;
                    if (bc == oc) firstMet = 2;
                }
            }

            if (delta > 0 || (delta == 0 && firstMet == 1)) {
                stdout.println("time 1\n");
            } else if (delta < 0 || (delta == 0 && firstMet == 2)) {
                stdout.println("time 2\n");
            } else {
                stdout.println("empate\n");
            }
        }
        stdout.close();
    }
}
