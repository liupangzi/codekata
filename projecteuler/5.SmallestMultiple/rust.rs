fn gcd(a: i32, b: i32) -> i32 {
    if b == 0 {
        return a;
    }
    return gcd(b, a % b);
}

fn main() {
    let mut result = 2520;

    for i in 11..21 {
        if gcd(result, i) != i {
            result *= i / gcd(result, i);
        }
    }

    println!("{}", result);
}
