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
    public TreeNode str2tree(String s) {
        if (s.length() == 0) return null;

        int firstLeftP = s.indexOf('(');
        if (firstLeftP == -1) return new TreeNode(Integer.valueOf(s));
        TreeNode result = new TreeNode(Integer.valueOf(s.substring(0, firstLeftP)));

        int counter = 1, secondLeftP = firstLeftP + 1;
        while (counter != 0) {
            if (s.charAt(secondLeftP) == ')') {
                counter--;
            } else if (s.charAt(secondLeftP) == '('){
                counter++;
            }
            secondLeftP++;
        }

        result.left = str2tree(s.substring(firstLeftP + 1, secondLeftP - 1));
        result.right = secondLeftP == s.length() ? null : str2tree(s.substring(secondLeftP + 1, s.length() - 1));
        return result;
    }
}
