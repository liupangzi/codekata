class Solution:
    def __init__(self):
        self.left = {}
        self.right = {}

    def widthOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root is not None:
            self.helper(root, 0, 0)

        result = 0
        for level in self.left:
            tmp = self.right[level] - self.left[level] + 1
            if result < tmp:
                result = tmp
        return result

    def helper(self, node, level, weight):
        if self.left.get(level, 2147483648) > weight:
            self.left[level] = weight

        if self.right.get(level, -2147483649) < weight:
            self.right[level] = weight

        if node.left is not None:
            self.helper(node.left, level + 1, weight * 2 + 1)

        if node.right is not None:
            self.helper(node.right, level + 1, weight * 2 + 2)

