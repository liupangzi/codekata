import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String[] table = new String[101];
        table[1] = "1";
        for (int i = 2; i < 101; i++) table[i] = multiply(String.valueOf(i), table[i - 1]);

        int count = Integer.valueOf(in.readLine());
        while (count-- > 0) out.println(table[Integer.valueOf(in.readLine())]);
        out.close();
    }

    private static String multiply(String a, String b) {
        int[] m = new int[a.length()], n = new int[b.length()];
        for (int i = a.length() - 1; i >= 0; i--) m[i] = a.charAt(i) - 48;
        for (int j = b.length() - 1; j >= 0; j--) n[j] = b.charAt(j) - 48;
        int len = a.length() + b.length(), result[] = new int[len], k = len - 1;

        for (int i = m.length - 1; i >= 0; i--, k--) {
            int tmp[] = new int[len], tmpK = k, mCarry = 0;
            for (int j = n.length - 1; j >= 0; j--) {
                tmp[tmpK] = (n[j] * m[i] + mCarry) % 10;
                mCarry = (n[j] * m[i] + mCarry) / 10;
                tmpK--;
            }
            tmp[tmpK] = mCarry;

            int aCarry = 0;
            for (int c = len - 1; c >= 0; c--) {
                int t = result[c] + tmp[c] + aCarry;
                result[c] = t % 10;
                aCarry = t / 10;
            }
        }

        int i = result[0] == 0 ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        while (i < result.length) {
            sb.append((char) (result[i++] + 48));
        }
        return sb.toString();
    }
}
