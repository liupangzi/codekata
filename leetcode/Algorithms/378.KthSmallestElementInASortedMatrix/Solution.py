class Solution(object):
    def kthSmallest(self, matrix, k):
        """
        :type matrix: List[List[int]]
        :type k: int
        :rtype: int
        """
        low, high = matrix[0][0], matrix[len(matrix) - 1][len(matrix[0]) - 1] + 1
        while low < high:
            mid = (high + low) / 2
            if self.binary_search(matrix, mid) < k:
                low = mid + 1
            else:
                high = mid
        return low

    def binary_search(self, matrix, mid):
        i, j, result = len(matrix) - 1, 0, 0
        while i >= 0 and j <= len(matrix) - 1:
            if matrix[i][j] > mid:
                i -= 1
            else:
                j += 1
                result += (i + 1)
        return result

