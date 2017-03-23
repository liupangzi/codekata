class Solution(object):
    def findTargetSumWays(self, nums, S):
        """
        :type nums: List[int]
        :type S: int
        :rtype: int
        """
        all_sum = sum(nums)
        if S < -all_sum or S > all_sum:
            return 0

        dp = [0] * (all_sum * 2 + 1)
        dp[all_sum] = 1
        for num in nums:
            tmp = [0] * (all_sum * 2 + 1)
            for i in range(len(dp)):
                if dp[i] != 0:
                    tmp[i + num] += dp[i]
                    tmp[i - num] += dp[i]
            dp = tmp

        return dp[S + all_sum]

