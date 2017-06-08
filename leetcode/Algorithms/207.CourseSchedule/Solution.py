class Solution(object):
    def canFinish(self, numCourses, prerequisites):
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: List[int]
        """
        cache, graph, index = [0] * numCourses, [], 0
        for i in xrange(numCourses):
            graph.append([])

        for i, j in prerequisites:
            cache[i] += 1
            graph[j].append(i)

        queue = [i for i in range(numCourses) if not cache[i]]
        while len(queue) != 0:
            n = queue.pop()
            index += 1
            for p in graph[n]:
                if cache[p] == 1:
                    queue.append(p)
                cache[p] -= 1
        return index == numCourses

