/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode nextHead = head.next.next;
        ListNode result = head.next;
        result.next = head;
        head.next = nextHead;
        while (nextHead != null && nextHead.next != null) {
            ListNode newNextHead = nextHead.next.next;
            head.next = nextHead.next;
            nextHead.next = newNextHead;
            head.next.next = nextHead;
            head = nextHead;
            nextHead = newNextHead;
        }

        return result;
    }
}
