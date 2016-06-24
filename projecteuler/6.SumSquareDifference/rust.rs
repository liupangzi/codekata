fn main() {
    let mut result = 0;

    for i in 1..101 {
        for j in i + 1..101 {
            result += 2 * i * j;
        }
    }

    println!("{}", result);
}
