package main

import (
    "time"
    "math/big"
)

func main() {
    start := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    m := make(map[string]bool)
    result := 0
    for a := 2; a <= 100; a++ {
        for b := 2; b <= 100; b++ {
            key := new(big.Int).Exp(big.NewInt(int64(a)), big.NewInt(int64(b)), nil).String()
            if _, ok := m[key]; !ok {
                m[key] = true
                result++
            }
        }
    }
    
    end := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    println("cost:", end - start, "ms")
    println(result)
}
