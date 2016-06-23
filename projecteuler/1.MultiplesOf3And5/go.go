package main

var i, result int = 0, 0

func main(){
    for i := 0; i < 1000; i++ {
        if i % 3  == 0 || i % 5 == 0 {
            result += i
        }
    }

    println(result)
}
