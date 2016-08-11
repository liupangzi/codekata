package main

import "time"

func main() {
    start := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    // n * n + a * n + b(n = 0) is a prime number, so b > 0
    // n = 1 => 1 + a + b is a prime number, n = 2 => 4 + 2a + b is a prime number, so b != 2
    // generated possible b
    bucket_b := []int{3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997}

    // numbers under 20k sieve
    limit := 9999
    sieve := make([]bool, limit)
    for i := 1; i < limit ; i++ {
        if sieve[i] == false {
            j := 2 * i * (i + 1)
            for j < limit {
                sieve[j] = true
                j = j + 2 * i + 1
            }
        }
    }

    tmp_length := 1
    tmp_a := 0
    tmp_b := 0

    for a := -999; a < 999; a += 2 {
        for _, b := range bucket_b {
            i := 1
            for {
                current := i * i + a * i + b
                if current > 2 && sieve[(current - 1) / 2] == false {
                    i++
                } else {
                    if i > tmp_length {
                        tmp_length = i
                        tmp_a = a
                        tmp_b = b
                    }
                    break
                }
            }           
        }
    }
    
    end := time.Now().UnixNano() / (int64(time.Millisecond)/int64(time.Nanosecond))

    println("cost:", end - start, "ms")
    println(tmp_a * tmp_b)
}
