/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;

        ListNode tmp = head, result;
        int length = 1;
        while (tmp.next != null) {
            tmp = tmp.next;
            length++;
        }
        tmp.next = head;

        k %= length;
        for (int i = 0; i < length - k; i++) tmp = tmp.next;

        result = tmp.next;
        tmp.next = null;
        return result;
    }
}
