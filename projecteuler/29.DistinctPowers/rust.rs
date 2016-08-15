fn main() {
    let boundary = 100; // boundary >= 2

    let max_base = (boundary as f64).sqrt() as i32;

    let mut max_power = 0;
    let mut tmp_boundary = boundary;
    while tmp_boundary >= 2 {
        tmp_boundary /= 2;
        max_power += 1;
    }

    for n in 2..max_power + 1 {
        for c in 2..max_base + 1 {
            if c.pow(n) <= boundary {
                println!("{} ^ {} = {}", c, n, c.pow(n));
            }
        }
    }

    println!("max_base: {}, max_power: {}", max_base, max_power);
}
