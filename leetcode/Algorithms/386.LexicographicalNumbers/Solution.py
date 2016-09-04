class Solution(object):
    def lexicalOrder(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        result = []
        current = 1
        for _ in xrange(n):
            result.append(current)
            if current * 10 <= n:
                current *= 10
            elif current % 10 != 9 and current + 1 <= n:
                current += 1
            else:
                current /= 10
                while current % 10 == 9:
                    current /= 10
                current += 1
        return result

