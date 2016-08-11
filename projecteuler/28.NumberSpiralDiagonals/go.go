package main

import "time"

func main() {
    start := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    length := 1001
    result := 0
    for a := 1; a < (length + 1) / 2; a++ {
        result += 16 * a * a + 4 * a + 4
    }
    
    end := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    println("cost:", end - start, "ms")
    println(result + 1)
}
