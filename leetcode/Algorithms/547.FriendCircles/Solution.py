class Solution(object):
    def findCircleNum(self, M):
        """
        :type M: List[List[int]]
        :rtype: int
        """
        result, length = 0, len(M)

        for i in xrange(length):
            if M[i][i] != 1:
                continue

            M[i][i] = -1
            queue = [i]
            while len(queue) != 0:
                index = queue.pop()
                for j in xrange(length):
                    if M[index][j] == 1 and M[j][j] == 1:
                        M[j][j] = -1
                        queue.append(j)
            result += 1

        return result

