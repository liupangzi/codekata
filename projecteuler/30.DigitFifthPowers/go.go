package main

import (
    "time"
)

func main() {
    start := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    result := 0
    begin := 10
    // 7 * (9 ^ 5)
    for begin < 413344 {
        tmp := 0
        number := begin
        for number != 0 {
            k := number % 10
            tmp += k * k * k * k * k
            number /= 10
        }

        if tmp == begin {
            result += begin
        }

        begin++
    }
    
    end := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))
    println("cost:", end - start, "ms")
    println(result)
}
