import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String a = stdin.readLine(), b = stdin.readLine();
        StringBuilder A = new StringBuilder(), B = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (47 < a.charAt(i) && a.charAt(i) < 58 || a.charAt(i) == '.') A.append(a.charAt(i));
        }

        for (int j = 0; j < b.length(); j++) {
            if (47 < b.charAt(j) && b.charAt(j) < 58 || b.charAt(j) == '.') B.append(b.charAt(j));
        }

        String cpf = A.substring(0, 11), numberA = A.substring(11), numberB = B.toString();
        int aPosition = numberA.indexOf('.'), bPosition = numberB.indexOf('.');
        double x = (aPosition == -1 || aPosition >= numberA.length() - 3)
                ? Double.parseDouble(numberA)
                : Double.parseDouble(numberA.substring(0, numberA.indexOf('.') + 3));
        double y = (bPosition == -1 || bPosition >= B.length() - 3)
                ? Double.parseDouble(B.toString())
                : Double.parseDouble(B.substring(0, numberB.indexOf('.') + 3));
        stdout.printf("cpf %s\n%.2f\n", cpf, x + y);
        stdout.close();
    }
}
