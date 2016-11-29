import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String[] tmp = stdin.readLine().split(" ");
        int withdraw = Integer.parseInt(tmp[0]);
        float account = Float.parseFloat(tmp[1]);

        if ((float) withdraw + 0.5 <= account && withdraw % 5 == 0) {
            stdout.println(account - withdraw - 0.50);
        } else {
            stdout.println(account);
        }
        stdout.close();
    }
}
