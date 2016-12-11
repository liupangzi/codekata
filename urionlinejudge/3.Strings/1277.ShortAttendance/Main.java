import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.parseInt(stdin.readLine());
        while (count-- > 0) {
            String useless = stdin.readLine();
            String[] students = stdin.readLine().split(" "), records = stdin.readLine().split(" ");
            ArrayList<String> result = new ArrayList<>();
            for (int i = 0; i < students.length; i++) {
                int p = 0, a = 0;
                for (char c : records[i].toCharArray()) {
                    if (c == 'A') {
                        a++;
                    } else if (c == 'P') {
                        p++;
                    }
                }
                if (p * 100 / (a + p) < 75) result.add(students[i]);
            }

            if (result.size() == 0) stdout.println("");
            for (int j = 0; j < result.size(); j++) {
                if (j == result.size() - 1) {
                    stdout.println(result.get(j));
                } else {
                    stdout.print(result.get(j) + " ");
                }
            }
        }
        stdout.close();
    }
}
