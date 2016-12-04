import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String[] counts = stdin.readLine().split(" ");
        int typeCount = Integer.valueOf(counts[0]), fileCount = Integer.valueOf(counts[1]);
        HashMap<String, String> fileTypes = new HashMap<>();
        while (typeCount-- > 0) {
            String[] types = stdin.readLine().split(" ");
            fileTypes.put(types[0], types[1]);
        }

        while (fileCount-- > 0) {
            String[] files = stdin.readLine().split("\\.");
            if (files.length > 1 && fileTypes.containsKey(files[files.length - 1])) {
                stdout.println(fileTypes.get(files[files.length - 1]));
            } else {
                stdout.println("unknown");
            }
        }
        stdout.close();
    }
}
