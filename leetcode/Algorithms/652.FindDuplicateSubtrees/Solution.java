import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private List<TreeNode> result = new ArrayList<>();
    private HashMap<String, Integer> cache = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        helper(root);
        return result;
    }

    private StringBuilder helper(TreeNode node) {
        if (node == null) return new StringBuilder("n");
        StringBuilder current = new StringBuilder();
        current.append(node.val).append('l').append(helper(node.left)).append('r').append(helper(node.right));

        String k = current.toString();
        if (!cache.containsKey(k)) {
            cache.put(k, 1);
        } else if (cache.get(k) == 1) {
            result.add(node);
            cache.put(k, 2);
        }
        return current;
    }
}
