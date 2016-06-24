package main

func main(){
    var result int = 0

    for i := 1; i < 101; i++ {
        for j := i + 1; j < 101; j++ {
            result += 2 * i * j
        }
    }

    print(result, "\n")
}
