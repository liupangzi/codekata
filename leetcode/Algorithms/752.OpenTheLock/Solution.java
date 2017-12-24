import java.util.Arrays;
import java.util.HashSet;

class Solution {
    private char[][] table = new char[][]{
            new char[]{'9', '1'},
            new char[]{'0', '2'},
            new char[]{'1', '3'},
            new char[]{'2', '4'},
            new char[]{'3', '5'},
            new char[]{'4', '6'},
            new char[]{'5', '7'},
            new char[]{'6', '8'},
            new char[]{'7', '9'},
            new char[]{'8', '0'}
    };

    public int openLock(String[] deadends, String target) {
        HashSet<String> visited = new HashSet<>(Arrays.asList(deadends)), queue = new HashSet<>();
        int result = 0;
        if (!visited.contains("0000")) queue.add("0000");
        while (!queue.isEmpty()) {
            if (queue.contains(target)) return result;
            HashSet<String> next = new HashSet<>();
            for (String s : queue) {
                visited.add(s);
                char[] tmp = s.toCharArray();
                for (int i = 0; i < 4; i++) {
                    char origin = tmp[i];
                    tmp[i] = table[origin - '0'][0];
                    String p = new String(tmp);
                    if (!visited.contains(p)) next.add(p);
                    tmp[i] = table[origin - '0'][1];
                    String n = new String(tmp);
                    if (!visited.contains(n)) next.add(n);
                    tmp[i] = origin;
                }
            }
            queue = next;
            result++;
        }
        return -1;
    }
}
