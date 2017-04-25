func maxProduct(nums []int) int {
	result, max, min := nums[0], nums[0], nums[0]
	for i := 1; i < len(nums); i++ {
		if nums[i] < 0 {
			min, max = max, min
		}
		min = getMin(nums[i], nums[i]*min)
		max = getMax(nums[i], nums[i]*max)
		result = getMax(result, max)
	}
	return result
}

func getMax(a int, b int) int {
	if a < b {
		return b
	}
	return a
}

func getMin(a int, b int) int {
	if a < b {
		return a
	}
	return b
}
