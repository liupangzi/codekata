class Solution(object):
    def findOrder(self, numCourses, prerequisites):
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: List[int]
        """
        topo, cache, graph = [], [0] * numCourses, []
        for i in xrange(numCourses):
            graph.append([])

        for i, j in prerequisites:
            cache[i] += 1
            graph[j].append(i)

        queue = [i for i in range(numCourses) if not cache[i]]
        while len(queue) != 0:
            n = queue.pop()
            topo.append(n)
            for p in graph[n]:
                if cache[p] == 1:
                    queue.append(p)
                cache[p] -= 1
        return topo if len(topo) == numCourses else []

