import java.util.*;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(Collections.singletonList(0));
        while (queue.size() > 0) {
            List<Integer> tmp = queue.poll();
            if (tmp.get(tmp.size() - 1) == graph.length - 1) {
                result.add(tmp);
            } else {
                for (int n : graph[tmp.get(tmp.size() - 1)]) {
                    List<Integer> next = new ArrayList<>(tmp);
                    next.add(n);
                    queue.add(next);
                }
            }
        }
        return result;
    }
}
