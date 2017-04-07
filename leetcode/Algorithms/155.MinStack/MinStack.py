class MinStack(object):
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = []
        self.min = 2147483647

    def push(self, x):
        """
        :type x: int
        :rtype: void
        """
        self.stack.append(x - self.min)
        if x < self.min:
            self.min = x

    def pop(self):
        """
        :rtype: void
        """
        if self.stack[-1] > 0:
            self.stack.pop()
        else:
            self.min -= self.stack[-1]
            self.stack.pop()

    def top(self):
        """
        :rtype: int
        """
        if self.stack[-1] > 0:
            return self.min + self.stack[-1]
        else:
            return self.min

    def getMin(self):
        """
        :rtype: int
        """
        return self.min

