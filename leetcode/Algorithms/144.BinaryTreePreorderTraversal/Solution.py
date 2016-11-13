# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


class Solution(object):
    def preorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        result = []
        self.helper(result, root)
        return result

    def helper(self, result, node):
        if node:
            result.append(node.val)
            self.helper(result, node.left)
            self.helper(result, node.right)

