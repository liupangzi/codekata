package main

func main() {
    fa := [999]int{0: 9, 1: 8}       // F11
    fb := [999]int{0: 4, 1: 4, 2: 1} // F12

    result := 13
    for {
        var tmp_array [999]int

        carry := 0
        for i := 0; i < 999; i++ {
            sum := fa[i] + fb[i] + carry
            carry = sum / 10
            tmp_array[i] = sum % 10
        }

        if carry > 0 {
            println(result)
            break
        }

        fa = fb
        fb = tmp_array

        result++
    }
}
