/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode tmp = dummyHead;

        int index = 1;
        while (index++ < m) tmp = tmp.next;

        ListNode subHead = tmp.next, newHead = subHead.next;
        while (m++ < n) {
            ListNode listNode = subHead;
            subHead = newHead;
            newHead = newHead.next;
            subHead.next = listNode;
        }
        tmp.next.next = newHead;
        tmp.next = subHead;

        return dummyHead.next;
    }
}
