package main

func main() {
    len := 160
    result := make([]int, len)
    result[0] = 8
    result[1] = 8
    result[2] = 2
    result[3] = 6
    result[4] = 3

    for count := 11; count < 100; count++ {
        a := count % 10
        b := count / 10

        result_1 := make([]int, len)
        carry_1 := 0
        for i := 0; i < len; i++ {
            origin_1 := result[i] * a + carry_1
            result_1[i] = origin_1 % 10
            carry_1 = origin_1 / 10
        }

        result_2 := make([]int, len)
        carry_2 := 0
        for j := 1; j < len; j++ {
            origin_2 := result[j - 1] * b + carry_2
            result_2[j] = origin_2 % 10
            carry_2 = origin_2 / 10
        }

        carry_3 := 0
        for k := 0; k < len; k++ {
            origin := result_1[k] + result_2[k] + carry_3
            result[k] = origin % 10
            carry_3 = origin / 10
        }
    }

    sum := 0
    for x:= 0; x < len; x++ {
        sum += result[x]
    }

    println(sum)
}
