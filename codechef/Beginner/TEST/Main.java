import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String tmp;
        while (!(tmp = stdin.readLine()).equals("42")) stdout.println(tmp);
        stdout.close();
    }
}
