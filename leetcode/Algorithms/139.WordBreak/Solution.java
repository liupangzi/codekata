import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] visited = new boolean[s.length() + 1];

        int length = s.length();
        while (!queue.isEmpty()) {
            int index = queue.poll();
            if (index == length) return true;
            for (String str : wordDict) {
                if (str.length() > length - index) continue;
                if (str.equals(s.substring(index, index + str.length())) && !visited[index + str.length()]) {
                    queue.add(index + str.length());
                    visited[index + str.length()] = true;
                }
            }
        }
        return false;
    }
}
