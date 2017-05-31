iclass NumArray(object):
    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self.bit = [0] * (len(nums) + 1)
        self.N = [0] * len(nums)
        for i in xrange(len(nums)):
            self.update(i, nums[i])

    def update(self, i, val):
        """
        :type i: int
        :type val: int
        :rtype: void
        """
        delta, origin = val - self.N[i], i
        i += 1
        while i < len(self.bit):
            self.bit[i] += delta
            i += i & -i
        self.N[origin] = val

    def sumRange(self, i, j):
        """
        :type i: int
        :type j: int
        :rtype: int
        """
        result, j = 0, j + 1
        while j != 0:
            result += self.bit[j]
            j -= j & -j
        while i != 0:
            result -= self.bit[i]
            i -= i & -i
        return result

