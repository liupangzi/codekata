package main

import(
    "math"
    "time"
)

func is_abundant(num int) bool {
    boundary := int(math.Sqrt(float64(num)))
    sum := 1

    for j := 2; j <= boundary; j++ {
        if num % j == 0 {
            if num == j * j {
                sum += j
            } else {
                sum += (j + num / j)
            }
        }
    }

    return sum > num
}

func main() {
    limit := 28123
    start := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    var abundant_nums []int
    for i := 12; i <= limit; i++ {
        if is_abundant(i) {
            abundant_nums = append(abundant_nums, i)
        }
    }

    var two_sum = make([]bool, limit)
    for j := 0; j < len(abundant_nums); j++ {
        for k := j; k < len(abundant_nums); k++ {
            sum := abundant_nums[k] + abundant_nums[j]
	    if sum > limit {
                break
            } else {
                two_sum[sum - 1] = true
            }
        }
    }

    result := 0
    for v := 0; v < len(two_sum); v++ {
        if !two_sum[v] {
            result += v + 1
        }
    }

    end := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    println("cost:", end - start, "ms")
    println("result:", result)
}
