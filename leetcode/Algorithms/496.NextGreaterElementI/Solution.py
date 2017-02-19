class Solution(object):
    def nextGreaterElement(self, findNums, nums):
        """
        :type findNums: List[int]
        :type nums: List[int]
        :rtype: List[int]
        """
        return [next((y for y in nums[nums.index(x):] if y > x), -1) for x in findNums]
