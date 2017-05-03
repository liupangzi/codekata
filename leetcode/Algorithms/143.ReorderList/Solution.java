public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return;

        ListNode slow = head, fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode tail = slow.next;
        if (fast.next != null) {
            tail = tail.next;
            slow = slow.next;
        }
        slow.next = null;

        ListNode cursor = head;
        tail = reverseList(tail);
        while (tail != null) {
            ListNode next = tail.next;
            tail.next = cursor.next;
            cursor.next = tail;
            tail = next;
            cursor = cursor.next.next;
        }
    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cursor = head.next;
        head.next = null;
        while (cursor != null) {
            ListNode next = cursor.next;
            cursor.next = head;
            head = cursor;
            cursor = next;
        }
        return head;
    }
}
