/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode one = head.next, two = head.next.next;
        while (two != null && two.next != null && one != two) {
            one = one.next;
            two = two.next.next;
        }
        if (one != two) return null;

        while (head != one) {
            head = head.next;
            one = one.next;
        }
        return head;
    }
}
