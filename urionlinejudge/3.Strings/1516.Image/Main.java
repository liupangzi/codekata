import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String line;
        while ((line = stdin.readLine()) != null && !line.equals("0 0")) {
            int originHeight = Integer.parseInt(line.substring(0, line.indexOf(' ')));
            int originWidth = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
            String[] tmp = new String[originHeight];
            for (int i = 0; i < originHeight; i++) tmp[i] = stdin.readLine();
            String scale = stdin.readLine();
            int newHeight = Integer.parseInt(scale.substring(0, scale.indexOf(' '))), cHeight = newHeight / originHeight;
            int newWidth = Integer.parseInt(scale.substring(scale.indexOf(' ') + 1)), cWidth = newWidth / originWidth;
            String[] result = new String[originHeight];
            for (int i = 0; i < tmp.length; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < tmp[i].length(); j++) {
                    for (int k = 0; k < cWidth; k++) stringBuilder.append(tmp[i].charAt(j));
                }
                result[i] = stringBuilder.toString();
            }

            for (String l : result) {
                for (int n = 0; n < cHeight; n++) stdout.println(l);
            }
            stdout.println("");
        }
        stdout.close();
    }
}
