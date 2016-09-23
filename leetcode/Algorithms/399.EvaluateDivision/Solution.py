import collections
import itertools

def calcEquation(self, equations, values, queries):
    quot = collections.defaultdict(dict)

    for (a, b), val in zip(equations, values):
        quot[a][a] = quot[b][b] = 1.0
        quot[a][b] = val
        quot[b][a] = 1 / val

    for k, i, j in itertools.permutations(quot, 3):
        if k in quot[i] and j in quot[k]:
            quot[i][j] = quot[i][k] * quot[k][j]

    return [quot[a].get(b, -1.0) for a, b in queries]

