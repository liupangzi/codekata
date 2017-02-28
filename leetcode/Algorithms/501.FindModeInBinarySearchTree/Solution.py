# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def __init__(self):
        self.current_value = 0
        self.current_count = 0
        self.max_count = 0
        self.result = []

    def findMode(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        self.morris_traversal(root)
        return self.result

    def update(self, val):
        if val != self.current_value:
            self.current_count = 1
        else:
            self.current_count += 1

        self.current_value = val

        if self.current_count > self.max_count:
            self.max_count = self.current_count
            self.result = [self.current_value]
        elif self.current_count == self.max_count:
            self.result.append(self.current_value)

    def morris_traversal(self, root):
        node = root

        while node is not None:
            if node.left is None:
                self.update(node.val)
                node = node.right
            else:
                pre = node.left
                while (pre.right is not None) and (pre.right != node):
                    pre = pre.right

                if pre.right is None:
                    pre.right = node
                    node = node.left
                else:
                    pre.right = None
                    self.update(node.val)
                    node = node.right

