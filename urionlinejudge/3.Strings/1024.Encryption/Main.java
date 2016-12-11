import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.valueOf(stdin.readLine());
        for (int i = 0; i < count; i++) stdout.println(encrypt(stdin.readLine()));
        stdout.close();
    }

    private static String encrypt(String string) {
        int i = 0, j = string.length() - 1;
        char[] chars = string.toCharArray();

        while (i < j) {
            char tmp = chars[i];
            chars[i] = isCharacter(chars[j]) ? (char) (chars[j] + 3) : chars[j];
            chars[j] = isCharacter(tmp) ? (char) (tmp + 2) : (char) (tmp - 1);
            i++;
            j--;
        }
        if (i == j) chars[i] += isCharacter(chars[j]) ? 2 : -1;

        return String.valueOf(chars);
    }

    private static boolean isCharacter(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}
