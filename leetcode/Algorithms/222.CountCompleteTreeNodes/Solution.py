class Solution(object):
    def countNodes(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root is None:
            return 0

        left, right, height = root, root, 0
        while right.right is not None:
            height += 1
            left = left.left
            right = right.right

        if left.left is None:
            return 2 ** (height + 1) - 1
        else:
            return 1 + self.countNodes(root.left) + self.countNodes(root.right)

