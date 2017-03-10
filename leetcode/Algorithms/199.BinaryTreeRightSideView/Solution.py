# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def __init__(self):
        self.result = []

    def rightSideView(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        self.travel(root, 1)
        return self.result

    def travel(self, tree_node, depth):
        if tree_node is None:
            return

        if depth > len(self.result):
            self.result.append(tree_node.val)

        self.travel(tree_node.right, depth + 1)
        self.travel(tree_node.left, depth + 1)

