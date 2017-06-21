class Solution(object):
    def findSubsequences(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = []
        self.backtracking(nums, 0, [], result)
        return result

    def backtracking(self, nums, index, tmp, result):
        if len(tmp) > 1:
            result.append(tmp[:])

        if index != len(nums):
            has_map = {}
            for i in range(index, len(nums)):
                if nums[i] in has_map:
                    continue
                has_map[nums[i]] = 1
                if len(tmp) == 0 or nums[i] >= tmp[-1]:
                    tmp.append(nums[i])
                    self.backtracking(nums, i + 1, tmp, result)
                    del tmp[-1]

