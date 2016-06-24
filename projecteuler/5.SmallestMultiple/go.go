package main

func gcd(a int, b int) int {
    if b == 0 {
        return a
    }
    return gcd(b, a % b)
}

func main(){
    var result int = 2520

    for i := 11; i < 21; i++ {
        if gcd(result, i) != i {
            result *= i / gcd(result, i);
        }
    }

    print(result, "\n")
}
