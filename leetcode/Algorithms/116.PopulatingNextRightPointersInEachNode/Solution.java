/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        while (root != null && root.left != null) {
            TreeLinkNode next = root.left;
            while (root != null) {
                root.left.next = root.right;
                if (root.next != null) root.right.next = root.next.left;
                root = root.next;
            }
            root = next;
        }
    }
}
