/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode result = new ListNode(0);
        while (head != null) {
            ListNode tmp = head, cursor = result;
            head = head.next;
            while (cursor.next != null && cursor.next.val < tmp.val) cursor = cursor.next;
            tmp.next = cursor.next;
            cursor.next = tmp;
        }
        return result.next;
    }
}
