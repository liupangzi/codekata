import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String input;
        while (!(input = stdin.readLine()).equals("0 0")) {
            String[] arr = input.split(" ");
            char compare = arr[0].charAt(0);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < arr[1].length(); i++) {
                if (arr[1].charAt(i) != compare) stringBuilder.append(arr[1].charAt(i));
            }

            int index = 0;
            while (index < stringBuilder.length() && stringBuilder.charAt(index) == '0') index++;
            if (index == stringBuilder.length()) {
                stdout.println("0");
            } else {
                stdout.println(stringBuilder.substring(index));
            }
        }
        stdout.close();
    }
}
