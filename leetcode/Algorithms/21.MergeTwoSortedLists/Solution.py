# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if None in (l1, l2):
            return l1 or l2

        result = current = ListNode(0)
        result.next = l1
        while l1 and l2:
            if l1.val < l2.val:
                l1 = l1.next
            else:
                current_next = current.next
                current.next = l2
                tmp = l2.next
                l2.next = current_next
                l2 = tmp
            current = current.next

        current.next = l1 or l2

        return result.next

