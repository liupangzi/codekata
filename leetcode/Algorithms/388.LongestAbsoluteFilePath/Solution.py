class Solution(object):
    def lengthLongestPath(self, input):
        """
        :type input: str
        :rtype: int
        """
        stack = [0] * (input.count('\n') + 2)
        max_length = 0
        for name in input.split('\n'):
            current_indent = name.rfind('\t') + 1;
            stack[current_indent + 1] = stack[current_indent] + len(name) - current_indent + 1
            if name.find(".") > -1:
                max_length = max(max_length, stack[current_indent + 1] - 1)

        return max_length
