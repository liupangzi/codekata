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
    
    let mut max_power = 0;
    let mut tmp_boundary = boundary;
    while tmp_boundary >= 2 {
        tmp_boundary /= 2;
        max_power += 1;
    }
    
    let mut records: HashMap<i32, i32> = HashMap::new();
    for n in 2..max_power + 1 {
        for c in 2..max_base + 1 {
            let key = c.pow(n as u32);
            if key <= boundary {
                records.insert(key, n);
            }
        }
    }
    
    let mut result = 99 * 99;
    for exp in records.values() {
        result -= get_duplicated(boundary, *exp);
    }

    println!("{}", result);
}
