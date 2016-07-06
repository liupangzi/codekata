package main

func is_leap(year int) int {
    if year % 4 == 0 && year % 400 != 0 {
        return 1
    }
    return 0
}

func main() {
    year_days := [2][12]int{
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    }
    weekday := 2
    result := 0

    for year := 1901; year <= 2000; year++ {
        is_leap_year := is_leap(year)
        for month := 0; month < 12; month++ {
            if weekday % 7 == 0 { result++ }
            weekday += year_days[is_leap_year][month]
        }
    }

    println(result)
}
