import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine()), sum = count;
        while (count-- > 0) {
            stdout.printf("Caso #%d:\n", sum - count);
            char[] str = stdin.readLine().toCharArray(), vowel = new char[str.length], consonant = new char[str.length];
            int vLength = 0, cLength = 0;
            for (int i = 0; i < str.length; i++) {
                if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                    vowel[vLength++] = str[i];
                    str[i] = 'v';
                } else {
                    consonant[cLength++] = str[i];
                    str[i] = 'c';
                }
            }

            int vIndex = 0, cIndex = 0, opCount = Integer.parseInt(stdin.readLine());
            while (opCount-- > 0) {
                String op = stdin.readLine();
                if (op.equals("2")) {
                    stdout.println(printString(str, vowel, vIndex, vLength, consonant, cIndex, cLength));
                } else {
                    int opStep = Integer.parseInt(op.substring(2));
                    if (op.charAt(0) == '1') {
                        if (cLength != 0) cIndex = (cIndex + cLength - opStep % cLength) % cLength;
                    } else {
                        if (vLength != 0) vIndex = (vIndex + vLength - opStep % vLength) % vLength;
                    }
                }
            }
        }
        stdout.close();
    }

    private static String printString(char[] str, char[] v, int vIndex, int vLength, char[] c, int cIndex, int cLength) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char x : str) {
            if (x == 'v') {
                stringBuilder.append(v[vIndex]);
                vIndex = (vIndex + 1) % vLength;
            } else {
                stringBuilder.append(c[cIndex]);
                cIndex = (cIndex + 1) % cLength;
            }
        }
        return stringBuilder.toString();
    }
}
