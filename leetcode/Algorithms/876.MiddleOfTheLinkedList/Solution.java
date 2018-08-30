class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode dummyHead = new ListNode(0), result = dummyHead, cursor = dummyHead;
        dummyHead.next = head;
        while (cursor != null) {
            result = result.next;
            cursor = cursor.next;
            if (cursor != null) cursor = cursor.next;
        }
        return result;
    }
}
