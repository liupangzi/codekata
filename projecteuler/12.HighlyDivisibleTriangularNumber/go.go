package main

import "math"

func main() {
    // (n * (n + 1) / 2)^0.5 >= 250 => n >= 354
    i := 354
    for {
        product := i * (i + 1) / 2
        boundary := int(math.Sqrt(float64(product)))
        count := 0
        factor := 1

        for factor <= boundary {
            if product % factor == 0 {
                count++
            }
            factor++
        }

        if count >= 250 {
            print(i * (i + 1) / 2, "\n")
            break
        }

        i++
    }
}
