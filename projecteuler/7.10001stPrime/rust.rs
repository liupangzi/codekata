fn optimized_is_prime(x: i32) -> bool {
    let mut factor = 3;
    let number = x as f32;
    let boundary = number.sqrt() as i32;

    while factor <= boundary {
        if x % factor == 0 {
            return false;
        }

        factor += 2;
        if factor % 5 == 0 {
            factor += 2;
        }
    }

    return true;
}

fn main() {
    let mut k = 2;
    let mut count = 4;
    let mut result = 0 as i32;
    let max_count = 10001;

    while count < max_count {
        result = 6 * k - 1;
        if result % 5 != 0 && optimized_is_prime(result) {
            count += 1;
            if count == max_count {
                break;
            }
        }

        result += 2;
        if result % 5 != 0 && optimized_is_prime(result) {
            count += 1;
            if count == max_count {
                break;
            }
        }

        k += 1;
    }

    println!("{}", result);
}
