package main

func main() {
    var result [305]int
    result[0] = 1

    for count := 0; count < 1000; count++ {
        carry := 0
        for i := 0; i < 305; i++ {
            origin := result[i] * 2 + carry;
            result[i] = origin % 10
            carry = origin / 10
        }
    }

    sum := 0
    for j := 0; j < 305; j++ {
        sum += result[j]
    }

    println(sum);
}
