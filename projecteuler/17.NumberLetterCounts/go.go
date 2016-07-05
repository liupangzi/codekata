package main

func main() {
    // zero, one, two, three, four, five, six, seven, eight, nine, ten
    // eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen
    ones := []int{0, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8}
    // ten, twenty, thirty, forty, fifty, sixty, seventy, eighty, ninety
    tens := []int{0, 3, 6, 6, 5, 5, 5, 7, 6, 6}

    result := 0
    for count := 1; count < 1000; count++ {
        if count % 100 == 0 {
            result += ones[count / 100] + len("hundred")
            continue
        }

        if count % 100 < 20 {
            result += ones[count % 100]
        } else if count % 10 == 0 {
            result += tens[(count % 100) / 10]
        } else {
            result += ones[count % 10]
            result += tens[(count % 100) / 10]
        }
        
        if count / 100 > 0 {
            result += ones[count / 100] + len("hundredand")
        }
    }

    println(result + len("onethousand"))
}
