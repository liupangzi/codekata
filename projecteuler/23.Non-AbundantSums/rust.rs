fn is_abundant(number: i32) -> bool {
    let boundary: i32 = (number as f64).sqrt() as i32;
    let mut sum: i32 = 1;

    for j in 2..boundary + 1 {
        if number % j == 0 {
            if number == j * j {
                sum += j;
            } else {
                sum += j + number / j;
            }
        }
    }

    return sum > number
}


fn main() {
    let mut abundant_nums = Vec::new();
    for i in 12..28124 {
        if is_abundant(i) {
            abundant_nums.push(i);
        }
    }

    let mut two_sum: [bool; 28123] = [false; 28123];
    for j in 0..abundant_nums.len() {
        for k in j..abundant_nums.len() {
            let sum = abundant_nums[k] + abundant_nums[j];
	    if sum > 28123 {
                break;
            } else {
                two_sum[sum as usize - 1] = true;
            }
        }
    }

    let mut result = 0;
    for v in 0..28123 {
        if !two_sum[v] {
            result += v + 1;
        }
    }

    println!("{}", result);
}
