import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String in[] = stdin.readLine().split(" ");
        int count = Integer.parseInt(in[0]), k = Integer.parseInt(in[1]), result = 0;
        while (count-- > 0) {
            if (Integer.parseInt(stdin.readLine()) % k == 0) result++;
        }
        stdout.println(result);
        stdout.close();
    }
}
