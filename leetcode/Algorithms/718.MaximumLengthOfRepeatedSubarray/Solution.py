class Solution:
    def findLength(self, A, B):
        """
        :type A: List[int]
        :type B: List[int]
        :rtype: int
        """
        matrix = [[0 for _ in range(len(B) + 1)] for _ in range((len(A) + 1))]
        for i in range(0, len(A)):
            for j in range(0, len(B)):
                if A[i] == B[j]:
                    matrix[i + 1][j + 1] = 1 + matrix[i][j]
        return max(max(row) for row in matrix)

