package main

func main(){
    // a < b < c
    for a := 3; a < 333; a++ {
        for b := a + 1; b < (1000 - 1 - a) / 2; b++ {
            c := 1000 - a - b
    	    if c * c == a * a + b * b {
                print("a: ", a, ", b: ", b , ", c: ", c, "\n")
            }
        }
    }
}
