import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.valueOf(stdin.readLine()), max = -1001;
        HashMap<String, Integer> scores = new HashMap<>();
        ArrayList<String[]> history = new ArrayList<>();
        while (count-- > 0) {
            String[] line = stdin.readLine().split(" ");
            history.add(line);
            scores.put(line[0], scores.getOrDefault(line[0], 0) + Integer.valueOf(line[1]));
        }

        HashMap<String, Integer> winners = new HashMap<>();
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                winners.clear();
                winners.put(entry.getKey(), 0);
            } else if (entry.getValue() == max) {
                winners.put(entry.getKey(), 0);
            }
        }

        scores.clear();
        for (String[] pair : history) {
            if (winners.containsKey(pair[0])) {
                scores.put(pair[0], scores.getOrDefault(pair[0], 0) + Integer.valueOf(pair[1]));
                if (scores.get(pair[0]) >= max) {
                    stdout.println(pair[0]);
                    stdout.close();
                    break;
                }
            }
        }
    }
}
