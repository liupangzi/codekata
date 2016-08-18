use std::collections::HashMap;

fn get_duplicated(boundary: i32, exp: i32) -> i32 {
    let mut duplicates = Vec::new();

    for n in 2..boundary + 1 {
        let mut tmp_exp = exp - 1;
        while tmp_exp > 0 {
            if (exp * n) % tmp_exp == 0 && (exp * n) / tmp_exp <= boundary {
                duplicates.push(n);
            }
            tmp_exp -= 1;
        }
    }

    duplicates.sort();
    duplicates.dedup();
    return duplicates.len() as i32;
}

fn main() {
    let boundary = 100; // boundary >= 2
    
    let max_base = (boundary as f64).sqrt() as i32;
    
    // find max power(when base == 2) and max tmp_boundary(boundary's root)
    let mut max_power = 0;
    let mut tmp_boundary = boundary;
    while tmp_boundary >= 2 {
        tmp_boundary /= 2;
        max_power += 1;
    }

    // find the max power of a number that equals x ^ y
    let mut records: HashMap<i32, i32> = HashMap::new();
    for n in 2..max_power + 1 {
        for c in 2..max_base + 1 {
            let key = c.pow(n as u32);
            if key <= boundary {
                records.insert(key, n);
            }
        }
    }

    // group by power, since get_duplicated() gets the same answer when tuple (boundary, power) is given
    let mut counts: HashMap<i32, i32> = HashMap::new();
    for exp in records.values() {
        if counts.contains_key(exp) {
            let tmp_count = counts[exp] + 1;
            counts.insert(*exp, tmp_count);
        } else {
            counts.insert(*exp, 1);
        }
    }

    // total
    let mut result = (boundary - 1) * (boundary - 1);
    for (power, power_count) in &counts {
        result -= get_duplicated(boundary, *power) * power_count;
    }

    println!("{}", result);
}
