fn main() {
    // sieve[i] == 1 stands for 2 * i + 1 is not prime
    // sieve[i] == 0 stands for 2 * i + 1 is prime
    let mut sieve = vec![0; 999999];
    let i_limit: u32 = ((2000000 as f64).sqrt() as u32 - 1) / 2;

    for i in 1..i_limit {
        let index = i as usize;
        if sieve[index] == 0 {
            let mut j: usize = 2 * index * (index + 1);
            while j < 999999 {
                sieve[j] = 1;
                j = j + 2 * index + 1;
            }
        }
    }

    let mut result: i64 = 2;
    for k in 1..999999 {
        if sieve[k] == 0 {
            result = result + 2 * k as i64 + 1;
        }
    }

    println!("{}", result);
}
