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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        travel(root, map);

        ArrayList<Integer> tmp = new ArrayList<>();
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                tmp.clear();
                tmp.add(entry.getKey());
                max = entry.getValue();
            } else if (entry.getValue() == max) {
                tmp.add(entry.getKey());
            }
        }

        int[] result = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) result[i] = tmp.get(i);
        return result;
    }

    private void travel(TreeNode treeNode, HashMap<Integer, Integer> map) {
        if (treeNode != null) {
            map.put(treeNode.val, map.getOrDefault(treeNode.val, 0) + 1);
            if (treeNode.left != null) travel(treeNode.left, map);
            if (treeNode.right != null) travel(treeNode.right, map);
        }
    }
}
