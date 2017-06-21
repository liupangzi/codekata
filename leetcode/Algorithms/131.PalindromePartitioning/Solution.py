class Solution(object):
    def partition(self, s):
        """
        :type s: str
        :rtype: List[List[str]]
        """
        cache = [[]]

        for index in range(len(s) - 1, -1, -1):
            tmp, suffix = [], s[index:]

            for cursor in range(index + 1, len(s)):
                sub = s[index:cursor]
                if sub == sub[::-1]:
                    for this_list in cache[len(s) - cursor]:
                        next_list = this_list[:]
                        next_list.insert(0, sub)
                        tmp.append(next_list)

            if suffix == suffix[::-1]:
                tmp.append([suffix])

            cache.append(tmp)

        return cache[-1]

