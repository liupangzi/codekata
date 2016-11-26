/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummyHead = new ListNode(0), start = dummyHead, end = head;
        dummyHead.next = head;
        while (end != null) {
            while (end.next != null && end.val == end.next.val) {
                end = end.next;
            }

            if (start.next == end) {
                start = end;
                end = end.next;
            } else {
                start.next = end.next;
                end = end.next;
            }
        }

        return dummyHead.next;
    }
}
