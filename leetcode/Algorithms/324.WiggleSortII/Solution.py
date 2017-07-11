class Solution(object):
    def wiggleSort(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        nums.sort()
        tmp, length = nums[:], len(nums)
        cursor = length / 2 + length % 2
        i, k = cursor - 1, 0

        for j in xrange(length - 1, cursor - 1, -1):
            nums[k] = tmp[i]
            nums[k + 1] = tmp[j]
            i -= 1
            k += 2

        if length % 2 == 1:
            nums[length - 1] = tmp[0]

