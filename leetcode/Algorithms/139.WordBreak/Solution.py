class Solution(object):
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: bool
        """
        table = [False] * (len(s) + 1)
        table[0] = True
        word_set = set(wordDict)
        for i in range(1, len(s) + 1):
            for j in range(0, i):
                if table[j] and word_set.__contains__(s[j: i]):
                    table[i] = True
        return table[len(s)]

