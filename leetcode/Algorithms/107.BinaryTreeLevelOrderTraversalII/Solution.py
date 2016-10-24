# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if not root:
            return []

        result = [[]]
        self.helper(result, root, 0)
        result.reverse()
        return result

    def helper(self, result, root, level):
        if len(result) == level:
            result.append([root.val])
        else:
            result[level].append(root.val)

        if root.left:
            self.helper(result, root.left, level + 1)
        if root.right:
            self.helper(result, root.right, level + 1)

