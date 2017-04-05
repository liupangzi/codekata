fn main() {
    println!("{}", sum_under_1k(3) + sum_under_1k(5) - sum_under_1k(15));
}

fn sum_under_1k(n: i32) -> i32 {
    let count = 999 / n;
    return n * count * (count + 1) / 2;
}
