import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String count;
        StringBuilder result = new StringBuilder();
        while ((count = stdin.readLine()) != null && !count.equals("0")) {
            int n = Integer.parseInt(count), max = 0;
            String[] tmp = new String[n];
            while (n-- > 0) {
                tmp[n] = parse(stdin.readLine());
                max = Math.max(max, tmp[n].length());
            }

            for (int i = tmp.length - 1; i >= 0; i--) {
                for (int j = 0; j < max - tmp[i].length(); j++) result.append(' ');
                result.append(tmp[i]).append("\n");
            }
            result.append("\n");
        }
        stdout.print(result.substring(0, result.length() - 1));
        stdout.close();
    }

    private static String parse(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ' || (result.length() > 0 && result.charAt(result.length() - 1) != ' ')) {
                result.append(string.charAt(i));
            }
        }
        return result.charAt(result.length() - 1) == ' ' ? result.substring(0, result.length() - 1) : result.toString();
    }
}
