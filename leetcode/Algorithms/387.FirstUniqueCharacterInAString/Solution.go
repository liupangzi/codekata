func firstUniqChar(s string) int {
    offset := 'a'
    str := [26]rune{0}
    
    for _, a := range s {
        str[a - offset]++
    }
    
    for i, b := range s {
        if str[b - offset] == 1 {
            return i
        }
    }
    
    return -1
}
