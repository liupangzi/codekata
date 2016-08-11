fn main() {
    let length = 1001;
    let mut result = 0;
    for a in 1..(length + 1) / 2 {
        result += 16 * a * a + 4 * a + 4;
    }

    println!("{}", result + 1);
}
