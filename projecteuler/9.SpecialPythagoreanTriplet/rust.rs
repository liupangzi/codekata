fn main() {
    // let a = (m^2 - n^2) ·d
    // let b = 2·m·n·d
    // let c = (m^2 + n^2) ·d
    // m > n && gcd(m, n) == 1

    /* (1)
     * 2 x d x m x (m + n) = s
     *     => m x (m + n) = s / (2 x d)
     *     => m^2 < s / (2 x d)
     *     => m^2 < s / 2
     *     => m <= round((s / 2)^0.5)
     * (2)
     * m > n > 0
     *     => m >= 2
     * (3)
     * s / 2 = m x d x (m + n)
     *     => (s / 2) % m == 0
     */
    for m in 2..round(Math.sqrt(500)) {
        if s / 2 % m == 0 {
            /*
             * (1)
             * k = m + n
             *     => k % 2 == 1
             */
            for k in m + 1..500 / m {
                // gcd(m, n) == 1 => gcd(m, m + n) == 1 => gcd(m, k) == 1
                if (500 / m) % k == 0 && 1 == gcd(m, k) {
                    println!("a: {}, b: {}, c: {}", a, b ,c);
                }
            }
        }
    }
}
