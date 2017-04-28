from collections import deque


class Solution(object):
    magic = 250
    height = 0
    length = 0

    def updateMatrix(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[List[int]]
        """
        if len(matrix) == 0:
            return matrix

        self.height, self.length = len(matrix), len(matrix[0])
        for i in range(self.height):
            for j in range(self.length):
                if matrix[i][j] != 0:
                    matrix[i][j] = self.magic

        queue = deque([])
        for i in range(self.height):
            for j in range(self.length):
                if matrix[i][j] == 0:
                    self.BFS(matrix, queue, i, j, 1)

        while len(queue) != 0:
            point = queue.popleft()
            self.BFS(matrix, queue, point[0], point[1], matrix[point[0]][point[1]] + 1)

        return matrix

    def BFS(self, matrix, queue, i, j, weight):
        if i > 0 and matrix[i - 1][j] == self.magic:
            matrix[i - 1][j] = weight
            queue.append([i - 1, j])
        if j > 0 and matrix[i][j - 1] == self.magic:
            matrix[i][j - 1] = weight
            queue.append([i, j - 1])
        if i + 1 < self.height and matrix[i + 1][j] == self.magic:
            matrix[i + 1][j] = weight
            queue.append([i + 1, j])
        if j + 1 < self.length and matrix[i][j + 1] == self.magic:
            matrix[i][j + 1] = weight
            queue.append([i, j + 1])

