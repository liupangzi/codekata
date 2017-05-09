import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;

        HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();
        map.put(node.label, new UndirectedGraphNode(node.label));

        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (queue.size() != 0) {
            UndirectedGraphNode origin = queue.poll(), next = map.get(origin.label);
            for (UndirectedGraphNode tmp : origin.neighbors) {
                if (!map.containsKey(tmp.label)) {
                    map.put(tmp.label, new UndirectedGraphNode(tmp.label));
                    queue.add(tmp);
                }
                next.neighbors.add(map.get(tmp.label));
            }
        }

        return map.get(node.label);
    }
}
