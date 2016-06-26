fn main() {
    // a = (m^2 - n^2) ·d
    // b = 2·m·n·d
    // c = (m^2 + n^2) ·d
    // m > n
    for m in 2..Math.sqrt(500) {
        for k in m + 1..500 / m {
            // gcd(m, n) == 1 => gcd(m, m + n) == 1 => gcd(m, k) == 1
            if (500 / m) % k == 0 && 1 == gcd(m, k) {
                println!("a: {}, b: {}, c: {}", a, b ,c);
            }
        }
    }
}
