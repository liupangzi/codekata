use std::collections::HashMap;

#[derive(Debug)]
struct Power {
    base: i32,
    exp: i32,
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

    let mut records: HashMap<i32, Power> = HashMap::new();
    for n in 2..max_power + 1 {
        for c in 2..max_base + 1 {
            let key = c.pow(n as u32);
            if key <= boundary {
                let tmp_power = Power { base: c, exp: n };
                records.insert(key, tmp_power);
            }
        }
    }

    println!("max_base: {}, max_power: {}", max_base, max_power);
    println!("===============================");
    for key in records.keys() {
        println!("key is: {}", key);
        println!("{:?}", records.get(&key));
        println!("-----------------------------------");
    }
}
