package main

var a, b int = 1, 2
var i, result int = 0, 2

func main(){
    for {
        // odd, odd, even
        for count := 0; count < 3; count++ {
            i = a + b
            a = b
            b = i
        }

        if i <= 4000000 {
            result += i
        } else {
            break
        }
    }

    println(result)
}
