import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int length = Integer.parseInt(stdin.readLine());
        String p = stdin.readLine(), s = stdin.readLine();
        stdout.println(getLongestMatch(s + s, p, length * 2, length));
        stdout.close();
    }

    private static int getLongestMatch(String s, String p, int sLength, int pLength) {
        int[] next = getNext(p, pLength);
        int i = 0, j = 0, maxLength = 0, maxPosition = 0;
        while (i < sLength && j < pLength) {
            if (j == -1 || s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else {
                if (j > maxLength) {
                    maxLength = j;
                    maxPosition = i - j;
                }
                j = next[j];
            }
        }
        return j == p.length() ? i - j : maxPosition;
    }

    private static int[] getNext(String pattern, int pLength) {
        int[] next = new int[pLength];
        next[0] = -1;
        int i = 0, j = -1;
        while (i < pLength - 1) {
            if (j == -1 || pattern.charAt(i) == pattern.charAt(j)) {
                if (pattern.charAt(++i) == pattern.charAt(++j)) {
                    next[i] = next[j];
                } else {
                    next[i] = j;
                }
            } else {
                j = next[j];
            }
        }
        return next;
    }
}
