import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        HashMap<String, String> tmp = new HashMap<>();
        tmp.put("tesoura papel", "rajesh");
        tmp.put("papel tesoura", "sheldon");
        tmp.put("papel pedra", "rajesh");
        tmp.put("pedra papel", "sheldon");
        tmp.put("pedra lagarto", "rajesh");
        tmp.put("lagarto pedra", "sheldon");
        tmp.put("lagarto spock", "rajesh");
        tmp.put("spock lagarto", "sheldon");
        tmp.put("spock tesoura", "rajesh");
        tmp.put("tesoura spock", "sheldon");
        tmp.put("tesoura lagarto", "rajesh");
        tmp.put("lagarto tesoura", "sheldon");
        tmp.put("lagarto papel", "rajesh");
        tmp.put("papel lagarto", "sheldon");
        tmp.put("papel spock", "rajesh");
        tmp.put("spock papel", "sheldon");
        tmp.put("spock pedra", "rajesh");
        tmp.put("pedra spock", "sheldon");
        tmp.put("pedra tesoura", "rajesh");
        tmp.put("tesoura pedra", "sheldon");

        int count = Integer.parseInt(stdin.readLine());
        while (count-- > 0) {
            stdout.println(tmp.getOrDefault(stdin.readLine(), "empate"));
        }
        stdout.close();
    }
}
