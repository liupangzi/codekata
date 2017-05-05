class Solution(object):
    def sortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head

        slow, fast = head, head.next
        while fast.next is not None and fast.next.next is not None:
            slow = slow.next
            fast = fast.next.next
        mid = slow.next
        slow.next = None

        return self.merge_sort(self.sortList(head), self.sortList(mid))

    def merge_sort(self, a, b):
        dummy_head = ListNode(0)
        cursor = dummy_head

        while a is not None and b is not None:
            if a.val < b.val:
                cursor.next = a
                a = a.next
            else:
                cursor.next = b
                b = b.next
            cursor = cursor.next
            cursor.next = None

        if a is not None:
            cursor.next = a
        if b is not None:
            cursor.next = b

        return dummy_head.next

