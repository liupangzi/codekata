package main

import "math"

func optimized_is_prime(number int) bool {
    factor := 3
    boundary := int(math.Sqrt(float64(number)))
    for factor <= boundary {
        if number % factor == 0 {
            return false
        }

        factor += 2
        if factor % 5 == 0 {
            factor += 2
        }
    }
    return true
}

func main(){
    k := 2
    count := 4
    result := 0
    maxCount := 10001

    for count < maxCount {
        result = 6 * k - 1
        if result % 5 != 0 && optimized_is_prime(result) {
            count++
            if count == maxCount {
                break
            }
        }

        result += 2
        if (result % 5 != 0 && optimized_is_prime(result)) {
            count++
            if count == maxCount {
                break
            }
        }

        k++
    }

    print(result, "\n")
}
