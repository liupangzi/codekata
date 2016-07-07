package main

import "math"

func get_amicable_number(number int) int {
    result := 1
    boundary := int(math.Sqrt(float64(number)))

    for i := 2; i <= boundary; i++ {
        if number % i == 0 {
            result += i + number / i
        }
    }

    return result
}

func main() {
    tmp := [10000]int{}
    result := 0

    for i := 3; i < 10000; i++ {
        if tmp[i] == 0 { tmp[i] = get_amicable_number(i) }
        if tmp[i] == i || tmp[i] > 9999 { continue }
        if tmp[tmp[i]] == 0 { tmp[tmp[i]] = get_amicable_number(tmp[i]) }
        if tmp[tmp[i]] == i {
            result += i + tmp[tmp[i]]
        }
    }

    println(result / 2)
}
