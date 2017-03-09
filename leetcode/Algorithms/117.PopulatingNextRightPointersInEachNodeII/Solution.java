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
        while (root != null) {
            TreeLinkNode dummyHead = new TreeLinkNode(0), cursor = dummyHead;
            while (root != null) {
                if (root.left != null) cursor = cursor.next = root.left;
                if (root.right != null) cursor = cursor.next = root.right;
                root = root.next;
            }
            root = dummyHead.next;
        }
    }
}
