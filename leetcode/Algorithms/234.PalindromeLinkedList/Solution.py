# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        if not head:
            return True

        def reverse(node):
            ans = None
            while node:
                tmp, node.next = node.next, ans
                ans, node = node, tmp
            return ans

        middle = fast = head
        while fast.next and fast.next.next:
            middle, fast = middle.next, fast.next.next

        rev = reverse(middle.next)
        fast = rev
        while fast and head.val == fast.val:
            fast, head = fast.next, head.next

        reverse(rev)
        return fast is None

