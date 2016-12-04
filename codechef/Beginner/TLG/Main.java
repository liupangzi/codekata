import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.valueOf(stdin.readLine()), p1Score = 0, p2Score = 0, lead = 0;
        String winner = "";
        while (count-- > 0) {
            String[] strings = stdin.readLine().split(" ");
            p1Score += Integer.valueOf(strings[0]);
            p2Score += Integer.valueOf(strings[1]);
            if (Math.abs(p1Score - p2Score) > lead) {
                lead = Math.abs(p1Score - p2Score);
                winner = p1Score > p2Score ? "1 " : "2 ";
            }
        }

        stdout.println(winner + lead);
        stdout.close();
    }
}
