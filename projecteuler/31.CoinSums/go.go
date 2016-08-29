package main

import "time"

func main() {
    start := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    count := 0
    for a := 0; a <= 2; a++ {
        for b := 0; b <= 4; b++ {
            if 200 - a * 100 - b * 50 < 0 {
                continue
            }
            for c := 0; c <= 10; c++ {
                if 200 - a * 100 - b * 50 - c * 20 < 0 {
                    continue
                }
                for d := 0; d <= 20; d++ {
                    if 200 - a * 100 - b * 50 - c * 20 - d * 10 < 0 {
                        continue
                    }
                    for e := 0; e <= 40; e++ {
                        if 200 - a * 100 - b * 50 - c * 20 - d * 10 - e * 5 < 0 {
                            continue
                        }
                        for f := 0; f <= 100; f++ {
                            if 200 - a * 100 - b * 50 - c * 20 - d * 10 - e * 5 - f * 2 < 0 {
                                continue
                            }
                            for g := 0; g <= 200; g++ {
                                if a * 100 + b * 50 + c * 20 + d * 10 + e * 5 + f * 2 + g == 200 {
                                    count++
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    end := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    println("cost:", end - start, "ms")
    println("count: ", count + 1)
}
