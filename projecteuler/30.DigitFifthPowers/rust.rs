fn main() {
    let mut result = 0;
    let mut begin = 10;
    // 7 * (9 ^ 5)
    while begin < 413344 {
        let mut tmp = 0;
        let mut number = begin;
        while number != 0 {
            let k = number % 10;
            tmp += k * k * k * k * k;
            number /= 10;
        }

        if tmp == begin {
            result += begin;
        }

        begin += 1;
    }

    println!("{}", result);
}
