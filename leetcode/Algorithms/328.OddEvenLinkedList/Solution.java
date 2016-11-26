/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode result = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            head.next = even.next;
            head = head.next;
            even.next = head.next;
            even = even.next;
        }

        head.next = evenHead;
        return result;
    }
}
