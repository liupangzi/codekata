fn calculate(max: i32, mut sum: i32) -> i32 {
    if max > sum {
        return 0;
    }

    if max == 1 {
        return 1;
    }

    let factors: [i32; 8] = [1, 2, 5, 10, 20, 50, 100, 200];

    let mut result = if sum % max == 0 {
        1
    } else {
        0
    };

    while sum >= max {
        for i in 0..factors.len() {
            if factors[i] < max {
                result += calculate(factors[i], sum - max);
            }
        }
        sum -= max;
    }

    return result;
}

fn main() {
    let mut result = 0;
    result += calculate(1, 200);
    result += calculate(2, 200);
    result += calculate(5, 200);
    result += calculate(10, 200);
    result += calculate(20, 200);
    result += calculate(50, 200);
    result += calculate(100, 200);
    result += calculate(200, 200);

    println!("{}", result);
}
