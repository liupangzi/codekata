public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode small = new ListNode(Math.min(head.val, head.next.val)), smallCursor = small;
        ListNode big = new ListNode(Math.max(head.val, head.next.val)), bigCursor = big;
        head = head.next;
        while (head.next != null) {
            if (head.next.val >= big.val) {
                bigCursor.next = head.next;
                bigCursor = bigCursor.next;
                head.next = bigCursor.next;
                bigCursor.next = null;
            } else {
                smallCursor.next = head.next;
                smallCursor = smallCursor.next;
                head.next = smallCursor.next;
                smallCursor.next = null;
            }
        }

        ListNode result = sortList(small), tmp = result;
        while (tmp.next != null) tmp = tmp.next;
        tmp.next = big;
        while (big.next != null && big.val == big.next.val) big = big.next;
        big.next = sortList(big.next);
        return result;
    }
}
