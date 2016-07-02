fn main() {
    // sieve[i] == 1 stands for 2 * i + 1 is not prime
    // sieve[i] == 0 stands for 2 * i + 1 is prime
    let mut sieve = vec![0; 49999];
    let i_limit: u32 = ((100000 as f64).sqrt() as u32 - 1) / 2;
    for i in 1..i_limit {
        let index = i as usize;
        if sieve[index] == 0 {
            let mut j: usize = 2 * index * (index + 1);
            while j < 49999 {
                sieve[j] = 1;
                j = j + 2 * index + 1;
            }
        }
    }

    let mut i = 1;
    let mut count = 0;
    while count <= 500 {
        count = 1;
        let mut sum = i * (i + 1) / 2;

        // sieve does not contain factor 2
        let mut carry_2 = 0;
        while sum % 2 == 0 {
            sum = sum / 2;
            carry_2 = carry_2 + 1;
        }
        count = count * (carry_2 + 1);

        for j in 1..49999 {
            if (2 * j + 1) * (2 * j + 1) > sum {
                count = count * 2;
                break;
            }

            let mut carry_exp = 0;
            while sum % (2 * j + 1) == 0 {
                sum = sum / (2 * j + 1);
                carry_exp = carry_exp + 1;
            }
            count = count * (carry_exp + 1);

            if sum == 1 {
                break;
            }
        }

        i = i + 1;
    }

    println!("{}", i * (i - 1) /2);
}
