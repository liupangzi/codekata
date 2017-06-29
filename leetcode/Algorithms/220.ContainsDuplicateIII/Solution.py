class Solution(object):
    def containsNearbyAlmostDuplicate(self, nums, k, t):
        """
        :type nums: List[int]
        :type k: int
        :type t: int
        :rtype: bool
        """
        if t < 0 or k == 0:
            return False

        cache = {}
        for i in xrange(len(nums)):
            key = nums[i] if t == 0 else nums[i] / t
            if key in cache:
                return True
            elif key - 1 in cache and nums[i] - cache.get(key - 1) <= t:
                return True
            elif key + 1 in cache and cache.get(key + 1) - nums[i] <= t:
                return True
            cache[key] = nums[i]
            if i >= k:
                if t == 0:
                    del cache[nums[i - k]]
                else:
                    del cache[nums[i - k] / t]
        return False

