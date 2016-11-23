class Solution(object):
    def kthSmallest(self, matrix, k):
        """
        :type matrix: List[List[int]]
        :type k: int
        :rtype: int
        """
        low = matrix[0][0]
        high = matrix[len(matrix) - 1][len(matrix[0]) - 1] + 1

        while low < high:
            mid = (high + low) / 2

            count = 0
            for line in matrix:
                for n in line:
                    if n <= mid:
                        count += 1

            if count < k:
                low = mid + 1
            else:
                high = mid

        return low

