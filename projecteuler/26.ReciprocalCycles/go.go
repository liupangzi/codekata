package main

import "time"

func get_cycle_length(number int) int {
    result := 1
    start := 9

    for start % number != 0 {
    	start %= number
        start = start * 10 + 9
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
            // 2 * x + 1 = (2 * i + 1)^2 => x = 2 * i * (i + 1)
            j := 2 * i * (i + 1)
            for j < limit {
                sieve[j] = true
                j = j + 2 * i + 1
            }
        }
    }
    sieve[2] = true

    for k := 1; k < limit; k++ {
        if sieve[k] == false {
            tmp := get_cycle_length(2 * k + 1)
            if tmp > result {
                result = 2 * k + 1
            }
        }
    }

    end := time.Now().UnixNano() / int64(time.Millisecond)

    println(result)
    println("cost:", end - start, "ms")
}
