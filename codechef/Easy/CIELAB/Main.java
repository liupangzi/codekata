import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);
 
        String[] strings = stdin.readLine().split(" ");
        int result = Integer.valueOf(strings[0]) - Integer.valueOf(strings[1]);
        if (result % 10 == 9) {
            result -= 1;
        } else {
            result += 1;
        }
        stdout.println(result);
        stdout.close();
    }
}
