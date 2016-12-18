import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String line;
        while ((line = stdin.readLine()) != null && line.length() != 0) {
            String[] box = line.split(" ");
            double a = Double.parseDouble(box[0]);
            double b = Double.parseDouble(box[1]);
            double c = Double.parseDouble(box[2]);
            stdout.printf("%.2f\n", (b * Math.tan(a / 180 * 3.141592654) + c) * 5);
        }
        stdout.close();
    }
}
