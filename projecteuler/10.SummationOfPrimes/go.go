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
    result := 2 + 3 + 5 + 7
    max := 2000000
    number := 0

    for 6 * k + 1 < max {
        number = 6 * k - 1
        if number % 5 != 0 && optimized_is_prime(number) {
            result += number
            if 6 * k + 1 >= max {
                break
            }
        }

        number += 2
        if (number % 5 != 0 && optimized_is_prime(number)) {
            result += number
        }

        k++
    }

    print(result, "\n")
}
