package main

import "time"

func get_cycle_length(number int) int {
    result := 1
    start := 10

    for start % number != 1 {
    	start %= number
        start *= 10
        result++
    }

    return result
}

func main() {
    start := time.Now().UnixNano() / int64(time.Millisecond)
    limit := 500
    sieve := make([]bool, limit)
    result := 0

    for i := 1; i < limit ; i++ {
        if sieve[i] == false {
            j := 2 * i * (i + 1)
            for j < limit {
                sieve[j] = true
                j = j + 2 * i + 1
            }
        }
    }
    // 2 * 2 + 1 == 5
    sieve[2] = true

    for k := 1; k < limit; k++ {
        if sieve[k] == false {
            if get_cycle_length(2 * k + 1) > result {
                result = 2 * k + 1
            }
        }
    }

    end := time.Now().UnixNano() / int64(time.Millisecond)

    println(result)
    println("cost:", end - start, "ms")
}
