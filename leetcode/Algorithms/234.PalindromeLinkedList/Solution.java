/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    private ListNode start;

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        this.start = head;
        return helper(head);
    }

    private boolean helper(ListNode head) {
        if (head == null) return true;
        if (!helper(head.next)) return false;
        if (head.val != this.start.val) return false;
        this.start = this.start.next;
        return true;
    }
}
