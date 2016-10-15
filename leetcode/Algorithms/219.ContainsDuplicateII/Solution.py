class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        s = set()
        for i, n in enumerate(nums):
            if i > k:
                s.remove(nums[i-k-1])
            if s.__contains__(nums[i]):
                return True
            s.add(nums[i])

        return False

