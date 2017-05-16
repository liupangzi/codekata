class Solution(object):
    def permuteUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        result = []
        self.helper(nums, [], result)
        return result

    def helper(self, nums, tmp, result):
        if len(nums) == 1:
            tmp.append(nums[0])
            result.append(tmp)
            return

        unique = set(nums)
        for cursor in unique:
            next_nums, next_tmp = nums[:], tmp[:]
            next_nums.remove(cursor)
            next_tmp.append(cursor)
            self.helper(next_nums, next_tmp, result)

