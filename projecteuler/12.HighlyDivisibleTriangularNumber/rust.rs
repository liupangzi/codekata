fn main() {
    let mut i: i32 = 354;
    loop {
        let product: i32 = i * (i + 1) / 2;
        let boundary = (product as f64).sqrt() as i32;
        let mut count = 0;
        let mut factor = 1;

        while factor <= boundary {
            if product % factor == 0 {
                count = count + 1;
            }
            factor = factor + 1;
        }

        if count >= 250 {
            println!("{}", i * (i + 1) / 2);
            break;
        }

        i = i + 1;
    }
}
