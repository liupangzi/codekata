package main

import (
    "io/ioutil"
    "strings"
    "sort"
)

func main() {
    contents, _ := ioutil.ReadFile("p022_names.txt")
    s := strings.Replace(string(contents), "\"", "", -1)
    s = strings.Replace(s, "\n", "", -1)
    array_names := strings.Split(s, ",")
    sort.Strings(array_names)

    table := map[string]int {
        "A": 1,
        "B": 2,
        "C": 3,
        "D": 4,
        "E": 5,
        "F": 6,
        "G": 7,
        "H": 8,
        "I": 9,
        "J": 10,
        "K": 11,
        "L": 12,
        "M": 13,
        "N": 14,
        "O": 15,
        "P": 16,
        "Q": 17,
        "R": 18,
        "S": 19,
        "T": 20,
        "U": 21,
        "V": 22,
        "W": 23,
        "X": 24,
        "Y": 25,
        "Z": 26,
    }

    result := 0
    for i := 0; i < len(array_names); i++ {
        array_char := strings.Split(array_names[i], "")

        tmp := 0
        for j:= 0; j < len(array_char); j++ {
            tmp += table[string(array_char[j])]
        }

        result += (i + 1) * tmp 
    }

    println(result)
}
