import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer, Integer> tmp = new HashMap<>();
        travelTreeNode(root, tmp);

        ArrayList<Integer> cache = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : tmp.entrySet()) {
            if (entry.getValue() > max) {
                cache.clear();
                cache.add(entry.getKey());
                max = entry.getValue();
            } else if (entry.getValue() == max) {
                cache.add(entry.getKey());
            }
        }

        int[] result = new int[cache.size()];
        for (int i = 0; i < cache.size(); i++) result[i] = cache.get(i);
        return result;
    }

    private int travelTreeNode(TreeNode treeNode, HashMap<Integer, Integer> tmp) {
        if (treeNode == null) return 0;
        int a = travelTreeNode(treeNode.right, tmp), b = travelTreeNode(treeNode.left, tmp);
        treeNode.val += a + b;
        tmp.put(treeNode.val, tmp.getOrDefault(treeNode.val, 0) + 1);
        return treeNode.val;
    }
}
