/**
 *  * Definition for singly-linked list.
 *   * public class ListNode {
 *    *     int val;
 *     *     ListNode next;
 *      *     ListNode(int x) { val = x; }
 *       * }
 *        */

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(0), b = new ListNode(0), tmpA = a, tmpB = b;
        while (head != null) {
            if (head.val < x) {
                tmpA.next = head;
                tmpA = tmpA.next;
            } else {
                tmpB.next = head;
                tmpB = tmpB.next;
            }
            head = head.next;
        }
        tmpB.next = null;
        tmpA.next = b.next;
        return a.next;
    }
}
