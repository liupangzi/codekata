class Solution(object):
    def solve(self, board):
        """
        :type board: List[List[str]]
        :rtype: void Do not return anything, modify board in-place instead.
        """
        if len(board) == 0:
            return

        height, length = len(board), len(board[0])
        queue = []

        for i in range(length):
            if board[0][i] == 'O':
                self.DFS(queue, board, 0, i)
            if board[height - 1][i] == 'O':
                self.DFS(queue, board, height - 1, i)

        for j in range(height):
            if board[j][0] == 'O':
                self.DFS(queue, board, j, 0)
            if board[j][length - 1] == 'O':
                self.DFS(queue, board, j, length - 1)

        for i in range(height):
            for j in range(length):
                if board[i][j] == 'O':
                    board[i][j] = 'X'
                if board[i][j] == 'V':
                    board[i][j] = 'O'

    def DFS(self, queue, board, m, n):
        queue.append([m, n])
        while len(queue) != 0:
            tmp = queue.pop()
            x, y = tmp[0], tmp[1]
            if board[x][y] == 'O':
                board[x][y] = 'V'
                if x > 0 and board[x - 1][y] == 'O':
                    queue.append([x - 1, y])
                if y > 0 and board[x][y - 1] == 'O':
                    queue.append([x, y - 1])
                if x + 1 < len(board) and board[x + 1][y] == 'O':
                    queue.append([x + 1, y])
                if y + 1 < len(board[0]) and board[x][y + 1] == 'O':
                    queue.append([x, y + 1])

