func allPathsSourceTarget(graph [][]int) [][]int {
	result := make([][]int, 0)
	dfs(graph, 0, make([]int, 1), &result)
	return result
}

func dfs(graph [][]int, index int, tmp []int, result *[][]int) {
	for _, n := range graph[index] {
		next := make([]int, len(tmp))
		copy(next, tmp)
		next = append(next, n)
		if n == len(graph)-1 {
			*result = append(*result, next)
		} else {
			dfs(graph, n, next, result)
		}
	}
}

