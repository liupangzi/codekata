func shortestToChar(S string, C byte) []int {
	var result = make([]int, len(S))
	distance := len(S) + 1

	for i := 0; i < len(S); i++ {
		if S[i] == C {
			result[i] = 0
			distance = 1
		} else {
			if result[i] < distance {
				result[i] = distance
				distance += 1
			}
		}
	}

	distance = len(S) + 1
	for i := len(S) - 1; i >= 0; i-- {
		if S[i] == C {
			distance = 1
		} else {
			if result[i] > distance {
				result[i] = distance
				distance += 1
			}
		}
	}

	return result
}

