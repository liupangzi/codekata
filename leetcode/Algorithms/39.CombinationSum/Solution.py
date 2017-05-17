iclass Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        result = []
        self.backtrack(candidates, target, 0, [], result)
        return result

    def backtrack(self, candidates, target, start, tmp, result):
        if target == 0:
            result.append(tmp[:])
        elif target > 0:
            for i in range(start, len(candidates)):
                tmp.append(candidates[i])
                self.backtrack(candidates, target - candidates[i], i, tmp, result)
                tmp.pop()

