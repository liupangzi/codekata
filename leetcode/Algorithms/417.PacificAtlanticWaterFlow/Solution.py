class Solution(object):
    def pacificAtlantic(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[List[int]]
        """
        if len(matrix) == 0:
            return []

        height, length = len(matrix), len(matrix[0])
        p = [[False for col in range(length)] for row in range(height)]
        a = [[False for col in range(length)] for row in range(height)]

        for i in xrange(height):
            p[i][0] = True
            self.DFS(matrix, p, i, 0)
            a[height - 1 - i][length - 1] = True
            self.DFS(matrix, a, i, length - 1)

        for i in xrange(length):
            p[0][i] = True
            self.DFS(matrix, p, 0, i)
            a[height - 1][length - 1 - i] = True
            self.DFS(matrix, a, height - 1, i)

        result = []
        for i in xrange(height):
            for j in xrange(length):
                if p[i][j] and a[i][j]:
                    result.append([i, j])
        return result

    def DFS(self, matrix, result, x, y):
        if x - 1 >= 0 and not result[x - 1][y] and matrix[x - 1][y] >= matrix[x][y]:
            result[x - 1][y] = True
            self.DFS(matrix, result, x - 1, y)
        if y - 1 >= 0 and not result[x][y - 1] and matrix[x][y - 1] >= matrix[x][y]:
            result[x][y - 1] = True
            self.DFS(matrix, result, x, y - 1)
        if x + 1 < len(matrix) and not result[x + 1][y] and matrix[x + 1][y] >= matrix[x][y]:
            result[x + 1][y] = True
            self.DFS(matrix, result, x + 1, y)
        if y + 1 < len(matrix[0]) and not result[x][y + 1] and matrix[x][y + 1] >= matrix[x][y]:
            result[x][y + 1] = True
            self.DFS(matrix, result, x, y + 1)

