package main

func findCircleNum(M [][]int) int {
	tmp := make([]bool, len(M))
	result := 0
	for i := 0; i < len(M); i++ {
		if !tmp[i] {
			travel(M, i, tmp)
			result++
		}
	}
	return result
}

func travel(M [][]int, n int, tmp []bool) {
	tmp[n] = true
	for i := 0; i < len(M); i++ {
		if M[n][i] == 1 && !tmp[i] {
			travel(M, i, tmp)
		}
	}
}

