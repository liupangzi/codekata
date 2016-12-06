import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String dna;
        while ((dna = stdin.readLine()) != null && dna.length() != 0) {
            String pattern = stdin.readLine();
            char[] t = dna.toCharArray(), p = pattern.toCharArray();
            int i = 0, j = 0, next[] = getNext(pattern);
            while (i < t.length && j < p.length) {
                if (j == -1 || t[i] == p[j]) {
                    i++;
                    j++;
                } else {
                    j = next[j];
                }
            }

            if (j == p.length) {
                stdout.println("Resistente");
            } else {
                stdout.println("Nao resistente");
            }
        }
        stdout.close();
    }

    private static int[] getNext(String pattern) {
        char[] p = pattern.toCharArray();
        int j = 0, k = -1, next[] = new int[p.length];
        next[0] = -1;
        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                j++;
                k++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
