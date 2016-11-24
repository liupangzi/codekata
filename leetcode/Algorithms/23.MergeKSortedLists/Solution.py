# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        length = len(lists)
        if length == 0:
            return None
        elif length == 1:
            return lists[0]
        else:
            return self.merge_two_list(self.mergeKLists(lists[:length / 2]), self.mergeKLists(lists[length / 2:]))

    def merge_two_list(self, l1, l2):
        dummy_head = cursor = ListNode(0)

        while l1 and l2:
            if l1.val < l2.val:
                cursor.next = l1
                l1 = l1.next
            else:
                cursor.next = l2
                l2 = l2.next
            cursor = cursor.next

        cursor.next = l1 or l2
        return dummy_head.next

