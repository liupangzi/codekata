package main

func optimized_is_prime(factor int64, number int64) {
    for factor <= number {
        factor += 2
        if factor % 5 == 0 {
            factor += 2
        }

        if factor < number && number % factor == 0 {
            println(factor)
            optimized_is_prime(factor, number / factor)
            return
        }
    }

    println(number)
}

func main(){
    optimized_is_prime(1, 600851475143)
}
