import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String password;
        while ((password = stdin.readLine()) != null && password.length() != 0) {
            int[] count = new int[3]; // upper / lower / number
            for (int i = 0; i < password.length(); i++) {
                if (isUpper(password.charAt(i))) {
                    count[0]++;
                } else if (isLower(password.charAt(i))) {
                    count[1]++;
                } else if (isNumber(password.charAt(i))) {
                    count[2]++;
                }
            }

            if ((count[0] > 0 && count[1] > 0 && count[2] > 0)
                    && (count[0] + count[1] + count[2] == password.length())
                    && (password.length() <= 32 && password.length() >= 6)) {
                stdout.println("Senha valida.");
            } else {
                stdout.println("Senha invalida.");
            }
        }
        stdout.close();
    }

    private static boolean isUpper(char c) {
        return c > 64 && c < 91;
    }

    private static boolean isLower(char c) {
        return c > 96 && c < 123;
    }

    private static boolean isNumber(char c) {
        return c > 47 && c < 58;
    }
}
