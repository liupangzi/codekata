import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private HashMap<Integer, List<Integer>> graph = new HashMap<>();
    private HashMap<Integer, Integer> records = new HashMap<>();

    public int findClosestLeaf(TreeNode root, int k) {
        buildGraph(graph, root, -1);
        while (!records.containsKey(k)) {
            HashMap<Integer, Integer> next = new HashMap<>();
            for (Map.Entry<Integer, Integer> entry : records.entrySet()) {
                if (graph.containsKey(entry.getKey())) {
                    for (int n : graph.remove(entry.getKey())) {
                        next.put(n, entry.getValue());
                    }
                }
            }
            records = next;
        }
        return records.get(k);
    }

    private void buildGraph(HashMap<Integer, List<Integer>> graph, TreeNode node, int parent) {
        if (node.left == null && node.right == null) records.put(node.val, node.val);

        graph.put(node.val, new ArrayList<>());
        graph.get(node.val).add(parent);

        if (node.left != null) {
            graph.get(node.val).add(node.left.val);
            buildGraph(graph, node.left, node.val);
        }

        if (node.right != null) {
            graph.get(node.val).add(node.right.val);
            buildGraph(graph, node.right, node.val);
        }
    }
}
