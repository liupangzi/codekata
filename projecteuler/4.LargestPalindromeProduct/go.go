package main

func is_palindrome_number(number int) bool {
    var origin int = number
    var tmp int = 0

    for origin > 0 {
        tmp = tmp * 10 + origin % 10
        origin /= 10
    }

    return number == tmp
}

func main(){
    var result int = 0

    for i := 999; i > 100; i-- {
        if result / i > 999 {
            break
        }

        for j := 999; j > i; j-- {
            if i * j <= result {
                break
            }

            if (is_palindrome_number(i * j)) {
                result = i * j
            }
        }
    }

    print(result, "\n")
}
