fn main() {
    let s: i64 = 1000;
    let half_s: i64 = s / 2;
    let m_limit: i64 = (s as f64).sqrt() as i64 + 1;
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
    for m in 2..m_limit {
        if half_s % m == 0 {
            /*
             * (1)
             * k = m + n
             *     => k % 2 == 1
             * (2)
             * m < k = m + n < 2m
             * (3)
             * s / 2 = m x d x (m + n)
             *     => k = (m + n) = (s / 2) / (m x d) < s / 2m
             * 
             */
            let k_start = if m % 2 == 0 {
                m + 1
            } else {
                m + 2
            };

            let mut half_s_div_m: i64 = s / (2 * m);
            while half_s_div_m % 2 == 0 {
                half_s_div_m = half_s_div_m / 2;
            }

            let k_end = if 2 * m  < half_s_div_m  {
                2 * m
            } else {
                half_s_div_m + 1
            };

            for k in k_start..k_end {
                // gcd(m, n) == 1 => gcd(m, m + n) == 1 => gcd(m, k) == 1
                if (half_s/ m) % k == 0 && 1 == gcd(m, k) {
                    let d: i64 = half_s / (m * k);
                    let n: i64 = k - m;
                    let a: i64 = (m * m - n * n) * d;
                    let b: i64 = (2 * m * n) * d;
                    let c: i64 = (m * m + n * n) * d;
                    println!("{}, {}, {}", a, b, c);
                    break;
                }
                // k += 2;
            }
        }
    }
}

fn gcd(x: i64, y: i64) -> i64 {
    let (mut a, mut b) = if x > y {
        (x, y)
    } else {
        (y, x)
    };

    while b != 0 {
        let r = a % b;
        a = b;
        b = r;
    }

    a
}
