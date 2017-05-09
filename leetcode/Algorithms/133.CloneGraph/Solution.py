class Solution:
    def __init__(self):
        self.map = {}

    def cloneGraph(self, node):
        if node is None:
            return None

        next = UndirectedGraphNode(node.label)
        self.map[str(node.label)] = next
        for tmp in node.neighbors:
            if str(tmp.label) in self.map:
                next.neighbors.append(self.map.get(str(tmp.label)))
            else:
                next.neighbors.append(self.cloneGraph(tmp))
        return self.map.get(str(node.label))

