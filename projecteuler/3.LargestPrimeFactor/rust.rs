fn optimized_is_prime(factor: i64, number: i64) {
    for mut x in factor..number {
        x += 2;
        if x % 5 == 0 {
            x += 2;
        }

        if x < number && number % x == 0 {
            println!("{}", x);
            optimized_is_prime(x, number / x);
            return;
        }
    }

    println!("{}", number);
}

fn main() {
    optimized_is_prime(1, 600851475143);
}
