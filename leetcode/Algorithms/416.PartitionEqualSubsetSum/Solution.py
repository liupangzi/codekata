class Solution(object):
    def canPartition(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        count = sum(nums)
        if count & 1 == 1:
            return False
 
        half = count >> 1
        dp = [False] * (half + 1)
        dp[0] = True
 
        for n in nums:
            for i in range(half - n, -1, -1):
                dp[i + n] |= dp[i]
 
        return dp[half]

