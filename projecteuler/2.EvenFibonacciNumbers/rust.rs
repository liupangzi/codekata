fn main() {
    let mut a = 1;
    let mut b = 2;
    let mut i = 0;
    let mut result = 2;

    loop {
        for x in 0..3 {
            i = a + b;
            a = b;
            b = i;
        }

        if i <= 4000000 {
            result += i;
        } else {
            break;
        }
    }

    println!("{}", result);
}
