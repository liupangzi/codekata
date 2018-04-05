import java.util.*;

class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for (int[] edge : times) {
            map.putIfAbsent(edge[0], new ArrayList<>());
            map.get(edge[0]).add(edge);
        }

        TreeMap<Integer, List<Integer>> queue = new TreeMap<>();
        queue.put(0, Collections.singletonList(K));

        HashSet<Integer> counter = new HashSet<>();
        int result = 0;
        while (!queue.isEmpty()) {
            int delay = queue.firstKey();
            for (int n : queue.remove(delay)) {
                if (counter.contains(n)) continue;
                counter.add(n);
                result = Math.max(result, delay);
                if (!map.containsKey(n)) continue;
                for (int[] edge : map.get(n)) {
                    queue.putIfAbsent(edge[2] + delay, new ArrayList<>());
                    queue.get(edge[2] + delay).add(edge[1]);
                }
            }
        }
        return counter.size() < N ? -1 : result;
    }
}
