fn get_cycle_length(number: i32) -> i32 {
    let mut result = 1;
    let mut start = 9;

    while start % number != 0 {
    	start %= number;
        start = start * 10 + 9;
        result += 1;
    }

    return result;
}

fn main() {
    let limit = 500;
    let mut sieve = vec![0; limit as usize];

    for i in 1..limit{
        let index = i as usize;
        if sieve[index] == 0 {
            let mut j: usize = 2 * index * (index + 1);
            while j < limit as usize{
                sieve[j] = 1;
                j = j + 2 * index + 1;
            }
        }
    }
    sieve[2] = 1;

    let mut len = 0;
    let mut k = limit - 1;
    while 2 * k + 1 > len {
        if sieve[k as usize] == 0 {
            let tmp = get_cycle_length(2 * k + 1);
            if tmp > len {
                len = tmp;
            }
        }
        k -= 1;
    }

    println!("{}", 2 * k + 3);
}
