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

    let mut i = 6;
    let mut count = 0;
    let mut keep_factor_count = 2;  // D(3) == 2;
    while count <= 500 {
        //println!("----------------------------------------");
        //if i % 2 == 0 {
        //    println!("D(({} * {}) / 2) = D({}) * D({})", i, i + 1, i / 2, i + 1);
        //    println!("keep_factor_count aka D({}) is: {}", i / 2, keep_factor_count);
        //} else {
        //    println!("D(({} * {}) / 2) = D({}) * D({})", i, i + 1, (i + 1) / 2, i);
        //    println!("keep_factor_count aka D({}) is: {}", i, keep_factor_count);
        //}
        let mut cal_factor_count = 1;
        let mut sum = if i % 2 == 0 {
            i + 1
        } else {
            (i + 1) / 2
        };

        // sieve does not contain factor 2
        let mut carry_2 = 0;
        while sum % 2 == 0 {
            sum = sum / 2;
            carry_2 = carry_2 + 1;
        }
        cal_factor_count = cal_factor_count * (carry_2 + 1);

        if sum > 1 {
            for j in 1..49999 {
                if (2 * j + 1) * (2 * j + 1) > sum {
                    cal_factor_count = cal_factor_count * 2;
                    break;
                }
            
                let mut carry_exp = 0;
                while sum % (2 * j + 1) == 0 {
                    sum = sum / (2 * j + 1);
                    carry_exp = carry_exp + 1;
                }
                cal_factor_count = cal_factor_count * (carry_exp + 1);
            
                if sum == 1 {
                    break;
                }
            }
        }

        //println!("cal_factor_count: {}", cal_factor_count);
        count = keep_factor_count * cal_factor_count;
        keep_factor_count = cal_factor_count;
        i = i + 1;
    }

    println!("{}", i * (i - 1) / 2);
}
