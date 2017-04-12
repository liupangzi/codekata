package solution

func minSubArrayLen(s int, nums []int) int {
	tmp := make([]int, len(nums)+1)
	for n := 0; n < len(nums); n++ {
		tmp[n+1] = tmp[n] + nums[n]
	}

	result := len(tmp)
	for i := 1; i < len(tmp); i++ {
		if tmp[len(tmp)-1]-tmp[i-1] < s {
			break
		}

		index := search(tmp, i, s) - i + 1
		if index < result {
			result = index
		}
	}

	if result == len(tmp) {
		return 0
	} else {
		return result
	}
}

func search(nums []int, index int, sum int) int {
	start, end := index, len(nums)-1

	for start != end {
		mid := (start + end) / 2
		delta := nums[mid] - nums[index-1]
		if delta < sum {
			start = mid + 1
		} else {
			end = mid
		}
	}

	return start
}

