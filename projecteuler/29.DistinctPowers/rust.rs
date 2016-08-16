use std::collections::HashMap;

fn get_duplicated(boundary: i32, base: i32, exp: i32) -> i32 {
    match base.pow(exp as u32) {
        4 => 49,
        9 => 49,
        25 => 49,
        36 => 49,
        49 => 49,
        100 => 49,
        32 => 48,
        8 => 49,
        27 => 49,
        16 => 58,
        81 => 58,
        64 => 62,
        _ => 0,
    }
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
    
    let mut records: HashMap<i32, HashMap<&str, i32>> = HashMap::new();
    for n in 2..max_power + 1 {
        for c in 2..max_base + 1 {
            let key = c.pow(n as u32);
            if key <= boundary {
                let mut tmp_power = HashMap::new();
                tmp_power.insert("base", c);
                tmp_power.insert("exp", n);
                records.insert(key, tmp_power);
            }
        }
    }

    let mut result = 99 * 99;
    for (key, record) in &records{
        result -= get_duplicated(boundary, record[&"base"], record[&"exp"]);
    }

    println!("{}", result);
}
