package main

func main() {
    count := 0
    result := 0

    for i := 2; i <= 1000000; i++ {
        tmp := 0
        j := i
        for j != 1 {
            if j % 2 == 0 {
                j /= 2
            } else {
                j = j * 3 + 1
            }
            tmp++
        }

        if tmp > count {
            count = tmp
            result = i
        }
    }

    println(result)
}
