import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        String line;
        while ((line = stdin.readLine()) != null && !line.equals(".")) {
            HashMap<Character, HashMap<String, Integer>> table = new HashMap<>();
            String[] tmp = line.split(" ");
            for (String a : tmp) {
                if (a.length() > 2) {
                    HashMap<String, Integer> v = table.getOrDefault(a.charAt(0), new HashMap<>());
                    v.put(a, v.getOrDefault(a, 0) + 1);
                    table.put(a.charAt(0), v);
                }
            }

            String[] cache = new String[26];
            for (Character c : table.keySet()) {
                HashMap<String, Integer> t = table.get(c);
                int maxSave = 0;
                for (String s : t.keySet()) {
                    int m = (s.length() - 2) * t.get(s);
                    if (m > maxSave) {
                        maxSave = m;
                        cache[c - 'a'] = s;
                    }
                }
            }

            StringBuilder firstLine = new StringBuilder();
            for (String b : tmp) {
                if (firstLine.length() != 0) firstLine.append(" ");
                if (cache[b.charAt(0) - 'a'] != null && b.equals(cache[b.charAt(0) - 'a'])) {
                    firstLine.append(b.charAt(0)).append('.');
                } else {
                    firstLine.append(b);
                }
            }
            stdout.println(firstLine);
            stdout.println(table.size());
            for (int k = 0; k < 26; k++) {
                if (cache[k] != null) stdout.printf("%c. = %s\n", cache[k].charAt(0), cache[k]);
            }
        }
        stdout.close();
    }
}
