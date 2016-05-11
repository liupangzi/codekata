fn main() {
    for a in 3..333 {
        for b in a + 1..(1000 - 1 - a) / 2 {
            let c = 1000 - a - b;
            if c * c == a * a + b * b {
                println!("a: {}, b: {}, c: {}", a, b ,c);
            }
        }
    }
}
